package org.ben.prototype.simple;

public class ConcretePrototype implements Prototype {

	public Prototype clone() {
		Prototype type = new ConcretePrototype();
		return type;
	}
}

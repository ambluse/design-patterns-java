package org.ben.prototype.simple;

public class Client {
	
	public void operation(Prototype example) {
		Prototype obj2  = example.clone();
		System.out.println(example==obj2);
	}
	
	
	public static void main(String[] args) {
		Prototype obj = new ConcretePrototype();
		Client client = new Client();
		client.operation(obj);
	}
}

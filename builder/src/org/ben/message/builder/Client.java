package org.ben.message.builder;

public class Client {

	
	public static void main(String[] args) {
		
		MsgBuilder builder = new GoodbyeBuilder();
		Director director = new Director(builder);
		director.construct("ben", "ben from");
	}
	
}

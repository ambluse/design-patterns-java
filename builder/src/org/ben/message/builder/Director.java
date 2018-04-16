package org.ben.message.builder;

public class Director {
	
	MsgBuilder msgBuilder;
	
	public Director(MsgBuilder msgBuilder) {
		this.msgBuilder=msgBuilder;
	}
	
	public void construct (String to,String from) {
		this.msgBuilder.buildTo(to);
		this.msgBuilder.buildFrom(from);
		this.msgBuilder.buildTitle();
		this.msgBuilder.buildBody();
		this.msgBuilder.sendMessage();
	}

}

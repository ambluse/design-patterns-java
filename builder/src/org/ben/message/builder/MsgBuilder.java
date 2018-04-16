package org.ben.message.builder;

import org.ben.message.EmailMessage;

public abstract class MsgBuilder {
	
	protected EmailMessage emailMessage;
	
	public abstract void buildTitle();
	
	public abstract void buildBody();
	
	public  void buildTo(String to) {
		emailMessage.setTo(to);
	}
	
	public void buildFrom(String from) {
		emailMessage.setFrom(from);
	}
	
	public void sendMessage() {
		emailMessage.send();
	}

}

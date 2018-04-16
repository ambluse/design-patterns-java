package org.ben.message.builder;

import org.ben.message.WelcomeEmailMessage;

public class GoodbyeBuilder extends MsgBuilder{
	
	public GoodbyeBuilder() {
		emailMessage = new WelcomeEmailMessage();
	}

	@Override
	public void buildTitle() {
		emailMessage.setTitle("再见");
		
	}

	@Override
	public void buildBody() {
		emailMessage.setBody("再见你");
	}

}

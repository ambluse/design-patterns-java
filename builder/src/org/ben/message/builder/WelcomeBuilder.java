package org.ben.message.builder;

import org.ben.message.WelcomeEmailMessage;

public class WelcomeBuilder extends MsgBuilder{
	
	public WelcomeBuilder() {
		emailMessage = new WelcomeEmailMessage();
	}

	@Override
	public void buildTitle() {
		emailMessage.setTitle("欢迎");
		
	}

	@Override
	public void buildBody() {
		emailMessage.setBody("欢迎你");
	}

}

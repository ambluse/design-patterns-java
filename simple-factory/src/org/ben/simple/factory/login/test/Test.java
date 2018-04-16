package org.ben.simple.factory.login.test;

import org.ben.simple.factory.login.Login;
import org.ben.simple.factory.login.factory.LoginFactory;

public class Test {
	
	public static void main(String[] args) {
		String loginType="domain";
		
		Login login = LoginFactory.createLogin(loginType);
		
		boolean isLogin = login.verify("benjamin", "123");
		
		System.out.println(isLogin);
	}
}

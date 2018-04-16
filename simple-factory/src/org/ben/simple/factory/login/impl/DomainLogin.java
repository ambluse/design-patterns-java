package org.ben.simple.factory.login.impl;

import org.ben.simple.factory.login.Login;

public class DomainLogin implements Login{

	@Override
	public boolean verify(String name, String password) {
		// TODO Auto-generated method stub
		// domain 登录的逻辑
		System.out.println("进行domain验证");
		return true;
	}

}

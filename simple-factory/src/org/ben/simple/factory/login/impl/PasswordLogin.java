package org.ben.simple.factory.login.impl;

import org.ben.simple.factory.login.Login;

public class PasswordLogin implements Login {

	@Override
	public boolean verify(String name, String password) {
		// TODO Auto-generated method stub
		// 密码登录的逻辑
		System.out.println("进行密码验证");
		return true;
	}

}

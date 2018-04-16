package org.ben.simple.factory.login.factory;

import org.ben.simple.factory.login.Login;
import org.ben.simple.factory.login.impl.DomainLogin;
import org.ben.simple.factory.login.impl.PasswordLogin;

/**
 * 静态工厂
 * 
 * @author BENJAMIN
 *
 */
public class LoginFactory {

	public static Login createLogin(String type) {
		if(type.equals("password")) {
			return new PasswordLogin();
		}else if (type.equals("domain")){
			return new DomainLogin();
		}else {
			throw new RuntimeException("未支持类型");
		}
	}
}

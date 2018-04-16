package org.ben.simple.factory.login;

/**
 * 静态工厂
 * 
 * @author BENJAMIN
 *
 */
public interface Login {

	// 登录的接口
	public boolean verify(String name, String password);
}

package org.ben.singleton;

/**
 * 饿汉模式
 * 
 * @author BENJAMIN
 *
 */
public class EagerSingleton {

	private static EagerSingleton instance = new EagerSingleton();
	
	/**
	 * 构造函数
	 */
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
}

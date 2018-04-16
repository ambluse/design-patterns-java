package org.ben.singleton;

/**
 * 懒汉式
 * 
 * @author BENJAMIN
 *
 */
public class LazySingleton {
	
	private static LazySingleton instance = null;
	
	private LazySingleton() {
		
	}
	
	public static synchronized LazySingleton getInstance() {
		if(instance!=null) {
			return new LazySingleton();
		}else {
			return instance;
		}
	}

}

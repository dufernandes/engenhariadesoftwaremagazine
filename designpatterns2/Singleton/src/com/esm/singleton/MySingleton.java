package com.esm.singleton;

public class MySingleton {

	private static MySingleton mySingleton = null;
	
	private MySingleton() {
		// private default constructor - avoid that other classes instantiate this one
	}
	
	public static MySingleton getInstance() {
		if (mySingleton == null) {
			mySingleton = new MySingleton();
		}
		return mySingleton;
	}
	
	public void doImportantThings() {
		System.out.println("I am doing important things");
	}
}

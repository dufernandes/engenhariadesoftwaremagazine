package com.esm.singleton;

public class MySynchroizedSingleton {

	private static MySynchroizedSingleton mySingleton = null;
	
	private MySynchroizedSingleton() {
		// private default constructor - avoid that other classes instantiate this one
	}
	
	public static synchronized MySynchroizedSingleton getInstance() {
		if (mySingleton == null) {
			mySingleton = new MySynchroizedSingleton();
		}
		return mySingleton;
	}
	
	public void doImportantThings() {
		System.out.println("I am doing important things");
	}
}

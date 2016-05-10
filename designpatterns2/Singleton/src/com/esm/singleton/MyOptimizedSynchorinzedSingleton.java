package com.esm.singleton;

public class MyOptimizedSynchorinzedSingleton {

	// volatile is needed so the object can be correctly handled by multithread access
	private volatile static MyOptimizedSynchorinzedSingleton mySingleton = null;
	
	private MyOptimizedSynchorinzedSingleton() {
		// private default constructor - avoid that other classes instantiate this one
	}
	
	public static MyOptimizedSynchorinzedSingleton getInstance() {
		// only use synchronization when the singleton is null
		if (mySingleton == null) {
			synchronized (MyOptimizedSynchorinzedSingleton.class) {
				// after synchronization do the null double-check
				if (mySingleton == null) {
					mySingleton = new MyOptimizedSynchorinzedSingleton();
				}
			}
		}
		return mySingleton;
	}
	
	public void doImportantThings() {
		System.out.println("I am doing important things");
	}
}

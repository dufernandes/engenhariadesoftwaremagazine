package com.esm.singleton;

public class MySingletonNoNullVerification {

	private static MySingletonNoNullVerification mySingleton = new MySingletonNoNullVerification();
	
	private MySingletonNoNullVerification() {
		// private default constructor - avoid that other classes instantiate this one
	}
	
	public static MySingletonNoNullVerification getInstance() {
		return mySingleton;
	}
	
	public void doImportantThings() {
		System.out.println("I am doing important things");
	}
}

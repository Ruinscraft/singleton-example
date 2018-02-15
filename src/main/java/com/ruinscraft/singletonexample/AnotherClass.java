package com.ruinscraft.singletonexample;

public class AnotherClass {

	public void doSomething(SingletonExample singletonExample) {
		
		// We need to call getSomePrivateField from SingletonExample.java...
		
		// 2 ways to do that
		
		int numberFromSingleton = SingletonExample.getInstance().getSomePrivateField();
		
		int numberFromParams = singletonExample.getSomePrivateField();
		
		System.out.println(numberFromSingleton);
		System.out.println(numberFromParams);
		
	}
	
}

package com.ruinscraft.singletonexample;

public class SingletonExample {

	private static SingletonExample instance;
	
	private int somePrivateField;
	
	public SingletonExample() {
		somePrivateField = 12;
	}
	
	public static SingletonExample getInstance() {
		return instance;
	}
	
	public int getSomePrivateField() {
		return somePrivateField;
	}
	
	public static void main(String[] args) {
		
		instance = new SingletonExample();
		
		AnotherClass someClass = new AnotherClass();
		
		someClass.doSomething(instance);
		
		DatabaseExample database = new DatabaseExample(instance);
		
		database.connectToDatabase();
		
	}
	
	public String getDatabaseConnectionInfo() {
		return "username:password";
	}
	
}

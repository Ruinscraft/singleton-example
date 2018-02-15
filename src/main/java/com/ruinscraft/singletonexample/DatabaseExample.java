package com.ruinscraft.singletonexample;

public class DatabaseExample {

	private SingletonExample singletonExample;
	
	public DatabaseExample(SingletonExample singletonExample) {
		this.singletonExample = singletonExample;
	}
	
	public void connectToDatabase() {
		
		singletonExample.getDatabaseConnectionInfo();
		
	}
	
}

package com.Revature.day2;

public class Scopes {
	public static int belongsToTheClass = 5;
	public int someField= 10;
	
	public void myMethod(int input) {
		System.out.println(input);
		System.out.println(someField);
		if(true) {
			String s = "Hello";
		}
		//System.out.println(s);
		return;
	}
	
	public void anotherMethod() {
		System.out.println(someField);
		return;
	}

}

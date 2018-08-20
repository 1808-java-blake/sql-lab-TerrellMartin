package com.Revature.day2;

public class FlowControl {
	
	public boolean b = true;
	
	public static void main(String[] args) {
		FlowControl fc = new FlowControl();
		fc.testIfMethod();
		fc.testSwitch();
		fc.testFor();
		fc.testWhile();
		fc.testdoWhile();
		fc.testTernary();

	}
	
	private void testTernary() {
		//It is most commonly used in string concat.
		String s ="test: " + (b? "Hello" : "world");
		System.out.println(s);
		
		//you can use any type of boolean expression as a condition
		//EXAMPLE
		
		String p = "result: " + (5==5? "Howdy" : "Nope");
		System.out.println(p);
	}

	private void testdoWhile() {
		// Do while is like while but it executes atleast once.
		double i = 2000;
		do {
			i = Math.random() * 3000;
			System.out.println("insied while loop i: " + i);
		}while(i < 1000);
		System.out.println("Do While loop done.");
	}
		

	private void testWhile() {
		// use while if you do not know how many iterations you are testing for.
		double i = 0;
		while(i < 1000) {
			i = Math.random() * 3000;
			System.out.println("insied while loop i: " + i);
		}
		System.out.println("While loop done.");
	}

	private void testFor() {
		//Use a for loop if you know exactly how many iterations you are looping for.
		
		for(int i = 0; i <= 5; i++) {
			System.out.println("for loop i: " + i);
		}
		
	}

	private void testSwitch() {
		int i = 3;
		switch (i) {
		case 1:
			System.out.println("option 1 selected");
			break;
		case 3:
			System.out.println("option 3 selected");
			break;
		case 2:
			System.out.println("option 2 selected");
			break;
			
		default:
			System.out.println("Invalid option");
			break;
		}
		
	}

	public void testIfMethod(){
		if(b) {
			System.out.println("Hello");
		}
		else {
			System.out.println("world");
		}
	}

}

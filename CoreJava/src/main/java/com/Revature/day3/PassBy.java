package com.Revature.day3;

public class PassBy {
	public static void main(String[] args) {
		PassBy pb = new PassBy();
		int i = 5;
		pb.method(i);
		System.out.println(i);
	}
	
	public void method(int i) {
		i++;
		System.out.println(i);
		return;
	}

}

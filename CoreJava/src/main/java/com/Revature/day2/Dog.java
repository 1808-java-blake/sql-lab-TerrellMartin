package com.Revature.day2;

public class Dog extends Pet{
	private String breed;
	private int numLegs;
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String breed, int numLegs, String name, String owner) {
		super();
		this.breed = breed;
		this.numLegs = numLegs;
		this.name = name;
		this.owner = owner;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getNumLegs() {
		return numLegs;
	}

	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}


	

}

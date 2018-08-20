package com.Revature.day4;

import java.util.ArrayList;

import com.Revature.day1.RollerCoaster;

public class CollectionLauncher {
	public static void main(String[] args) {
		ArrayList<RollerCoaster> rollerCoasters = new ArrayList<>();
		System.out.println(rollerCoasters);
		rollerCoasters.add(new RollerCoaster(1, 1, 1, "one")); // This is the get(0)
		rollerCoasters.add(new RollerCoaster(1, 1, 1, "two"));  //This is the get(1)
		rollerCoasters.add(new RollerCoaster(500, 10, 2, "blake"));   //This is the get(2)
		System.out.println(rollerCoasters);
		System.out.println(rollerCoasters.get(2));
	}

}

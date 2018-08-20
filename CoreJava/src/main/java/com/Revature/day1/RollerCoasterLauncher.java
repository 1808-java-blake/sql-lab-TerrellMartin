package com.Revature.day1;
//whenever a program does not know the name of a variable (string) it will print null.
//whenever a program does not know the number of a variable it will default print 0.

public class RollerCoasterLauncher {

	public static void main(String[] args) {
		RollerCoaster rollerCoaster7000 = new RollerCoaster(12, 9, 5, "Roller");
		System.out.println(rollerCoaster7000.getName());
		System.out.println(rollerCoaster7000.getMaxCapacity());
		//System.out.println(rollerCoaster7000.name);
		//rollerCoaster7000.name = "Roller Coaster 7000";
		//System.out.println(rollerCoaster7000.name);
		//System.out.println(rollerCoaster7000.numberCarts);

	}

}

package com.Revature.day2;

//Key commands
//Auto Generate hashcode, toString, .equal: Alt + Shift + S
// Auto format: Ctrl + Shift + f
//Auto import: Ctrl + Shift + O
//Save all unsaved files: Ctrl + Shift + s
//Source : Alt + Shift + s
//Rename(Refractor): alt + shift + r

public class Trash {
	private int id;

	public Trash() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Trash(int id) {
		
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trash other = (Trash) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Trash [id=" + id + "]";
	}


	@Override
	protected void finalize() throws Throwable {
		System.out.println("cleaning up trash with id" + this.id);
		super.finalize();
	}
	

}

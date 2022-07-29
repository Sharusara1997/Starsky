package com.abs;

public class Matri extends Profiles {
	@Override
	public void ramProfile() {
System.out.println("Applicable but hide");		
	}
	@Override
	public void samProfile() {
System.out.println("Applicable but in hide ");
}
	public static void main(String[] args) {
		Matri a=new Matri();
		a.ramProfile();
		a.samProfile();
		a.rajuProfile();
		a.ramuProfile();
		
		
		
	}
}


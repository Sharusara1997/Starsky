package com.abs;

public abstract class Profiles {
	public abstract void ramProfile();
	public abstract void samProfile();
	
	public void rajuProfile() {
		System.out.println("Yes based on match");
	}
	public void ramuProfile() {
System.out.println("Yes only for Elite");

	}
	public static void main(String[] args) {
		Profiles a=new Matri();
		a.rajuProfile();
		a.ramProfile();
		a.samProfile();
		

	}
}

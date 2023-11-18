package com.upskill.assignment_5;

public class InterfaceImplementation implements Interface{

	@Override
	public void iDoor() {
		System.out.println("My Car has 4 door");
		
	}

	@Override
	public String iEngine() {
		System.out.println("My Car has Dual Motor  Engine");
		return "Dual Motor";
	}

	@Override
	public int iSeat() {
		System.out.println("My Car has 4 Seat");
		return 4;
	}

	@Override
	public void iColor() {
		System.out.println("My Car is Red");
		
	}

}

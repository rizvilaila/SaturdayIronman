package com.upskill.java_1_5;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType {
	
	/* 	Polymorphism is the ability of an object to take on many forms.
	 - Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/
public static void main(String[] args) {
	car ();
	car ("Red");
	car (4);
	car ("Red" , 5);
	weeklyIncomeStatic();
	
}
public static void weeklyIncomeStatic () {
	int calculateWeeklyIncome =hourlyincome * 40;
	int RealEstateIncome = 1400;
	int totalincome = calculateWeeklyIncome+RealEstateIncome;
	System.out.println ("My Weekly 	Income = " + totalincome);
}

public static void car () {
	System.out.println("My Car is Tesla");
	}
	public static void car(String color) {
		System.out.println("My car is Tesla, my Tesla color : " + color );
		}
	public static void car (int door) {
		System.out.println("My car is Tesla, my Tesla door : " + door);
		}
	public static void car (String color, int door) {
		System.out.println("My car is Tesla, my Tesla color : " + color + " , my Tesla Door : " + door);
	}
	
}

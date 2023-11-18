package com.upskill.java_1_3;

import com.upskill.java_1.MethodType;

public class Inheritance extends MethodType
{
	/* The process of obtaining the data members and methods from 
		one class to another class is known as inheritance.
-	Single Inheritance - we take data from parents class to child class
-	Multiple Inheritance	- we take data from two different parents class to child class
(Java doesn't support Multiple Inheritance directly rather through Interfaces)
-	Multilevel Inheritance- data gets transferred from grand parent class to parent class and then to child class


*/

	public static void main(String[] args) {
		
		weeklyIncomeStatic ();
		
		Inheritance obj = new Inheritance();
		obj.annualIncomeVoid();
		}

}

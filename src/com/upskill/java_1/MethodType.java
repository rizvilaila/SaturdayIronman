package com.upskill.java_1;

public class MethodType {
	
/* Types of Methods
 1. Void Method
 2. Static Method
 3. Return Type Method
 
 */
public static int hourlyincome = 65;
	
	public static void main(String[] args) {
		System.out.println("Upskill");
		weeklyIncomeStatic ();
		
		MethodType myObj = new MethodType ();    // ClassName ObjectName = new ClassName ();
		myObj.annualIncomeVoid();
		
	}
	// void method
	public void annualIncomeVoid () {
		int calculateAnnualIncome =hourlyincome * 2000;
		System.out.println ("My annual Income = " + calculateAnnualIncome); 

}
	//Static Method
	public static void weeklyIncomeStatic () {
		int calculateWeeklyIncome =hourlyincome * 40;
		System.out.println ("My Weekly 	Income = " + calculateWeeklyIncome); 
	}

	//Return Type Method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome =hourlyincome * 180;
		return calculateMonthlyIncome;
		}
}
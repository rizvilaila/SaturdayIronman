package com.upskill.java_1_4;

public class Loops {
	
	/*
	 Type of Loops
	 1. For loop
	 2. While Loop
	 3. Do While Loop
	 4. Infinite Loop
	  */
	 public static void main(String[] args) {
		//practiceForLoop();
		//practiceWhileLoop();
		//practiceDoWhileLoop();
		//practiceInfiniteLoop();
		practiceNestedforLoop();
		  
		}
public static void practiceForLoop() {             // For loop - do again and again upto upper limit
	int i ;                                             // Initialize the variable
	for (i=1; i<=10; i++) {                             // Setting lower limit, Upper limit, Increment or decrement
		System.out.println("For Loops Number = " + i);                          // statement
		}
		}
 public static void practiceWhileLoop() {                //While Loop - do again and again upto upper limit
	                                                     // Initialize the variable
	 int i = 1;                                           // Setting Conditions
  while (i<=10) {                                           //Statement
		 System.out.println("while Loops Number = " + i);   // Increment or decrement
		 i++;
		 }
 }
 public static void practiceDoWhileLoop() {                   //Do While Loop - Do action Then match condition
	 int i = 1;                                               // Initialize the Variable
	 do {                                                    //statement
		 System.out.println("Do While Loops Number = " + i);  //Increment or decrement
		 i++;                                                // checking condition
		 
	 } while (i<=0);
 }
 
 public static void practiceInfiniteLoop() {             // For loop - never ending loop
		int i ;                                             // Initialize the variable
		for (i=1; ; i++) {                             // Setting No Upper limit, 
			System.out.println("Infinte Loops Number = " + i);                          // statement
			}
 }
 public static void practiceNestedforLoop() {   
	 int i;
	 int j;
	 
	 for (i= 1; i<=10; i++) {
		 for (j =1; j<=10; j++) {
			
			int multiplicationTable=i * j ;
			System.out.print(multiplicationTable + " " );
					
		 }
		 System.out.println(" ");
	 }
   }

		 
}
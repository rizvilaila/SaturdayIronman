package com.upskill.assignment_3;

public class Loops {

	public static void main(String[] args) {

		practiceNestedforLoop();

	}

	public static void practiceForLoop1() { // For loop - do again and again upto upper limit
		int i; // Initialize the variable
		for (i = 1; i <= 20; i++) { // Setting lower limit, Upper limit, Increment or decrement
			System.out.println("For Loops Number = " + i); // statement
		}
	}

	public static void practiceWhileLoop() { // While Loop - do again and again until the condition meet
		// Initialize the variable
		int i = 1; // Setting Conditions
		while (i <= 10) { // Statement
			System.out.println("while Loops Number = " + i); // Increment or decrement
			i++;
		}
	}

	public static void practiceDoWhileLoop() { // Do While Loop - Do action Then match condition
		int i = 1; // Initialize the Variable
		do { // statement
			System.out.println("Do While Loops Number = " + i); // Increment or decrement
			i++; // checking condition

		} while (i <= 10);
	}

	public static void practiceInfiniteLoop() { // infinite loop - never ending loop
		int i; // Initialize the variable
		for (i = 1;; i++) { // Setting No Upper limit,
			System.out.println("Infinte Loops Number = " + i); // statement
		}
	}

	public static void practiceNestedforLoop() { // Nested Loop - loop inside another loop
		int i; // Initialize i for loop 1

		int j; // initialize j for loop 2

		for (i = 1; i <= 10; i++) { // first loop for i
			for (j = 1; j <= 10; j++) { // first loop for j

				int multiplicationTable = i * j;
				System.out.print(multiplicationTable + " |"); // statement for loop 2

			}
			System.out.println(" -> "); // statement for loop 1

		}
	}
}

package com.upskill.java_1_3;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 65;

		if (age <= 13) {
			System.out.println("You are children");
		} else if (age > 13 && age < 18) {
			System.out.println("You are teenager");
		} else if (age >= 60) {
			System.out.println("You are senior");
			if (age >= 100) {
				System.out.println("You are Champion");
			} else {
				System.out.println("You are senior");
			}
		} else {
			System.out.println("You are adult");
		}

		// For example, assigning grades (A, B, C) based on the
		// percentage obtained by a student.

		// if the percentage is above 90, assign grade A
		// if the percentage is above 75, assign grade B
		// if the percentage is above 65, assign grade C

		int percentage = 74;

		if (percentage >= 90) {
			System.out.println("Grade: A");
		} else if (percentage >= 75) {
			System.out.println("Grade: B");
		} else if (percentage >= 65) {
			System.out.println("Grade: C");
		} else {
			System.out.println("Grade: D");
		}
	}

	}



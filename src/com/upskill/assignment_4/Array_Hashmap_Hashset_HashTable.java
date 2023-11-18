package com.upskill.assignment_4;

import java.util.HashMap;
import java.util.HashSet;



public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		//Array store multiple data using index
		
int age = 30; 				//Variable
int []ageIronMan = new int [] {25, 32, 37, 21, 27 };   //Array
// Array index     			[0] [1] [2] [3] [4]

System.out.println("Student age : " + ageIronMan[3]);
System.out.println("Total Student : " + ageIronMan.length);
	
String[] nameIronman = new String []{ "Laila" , "Yusuf" , "Abdullah", "Rasel", "Jamil"};
	
System.out.println("Student Name : " + nameIronman[4]);
System.out.println("Total Student Name : " + ageIronMan.length);
	
	//Multi-Dimentional Array
 int [][] ageIronMan2D = {{25, 32, 37, 21, 27, 32} , 	//[0][0] [0][1] [0][3] [0][4] [0][5]
 							{26, 30, 33, 28}}; //[1][0] [1][1] [1][2] [1][3]
	
	System.out.println("Student Age 2D : " + ageIronMan2D[0][3]);
	
	//HashMap store multiple data using key-value pair, Implementation of Map interface
	
	HashMap<String, Integer > Student = new HashMap<String, Integer > ();
	Student.put("laila", 21);
	  Student.put("Abdullah", 19);
	  Student.put("Madan", 24);
	  Student.put("Shishir", 23);
	  Student.put("Rasel", 26);
	  
	  System.out.println("Hashmap Student Age : " + Student.get("laila"));
	  
	  HashMap<String, String > Capital = new HashMap<String, String > ();
	  Capital.put("America" , "Washington");
	  Capital.put("Pakistan" , "Islamabad");
	  Capital.put("Bangladesh" , "Dhaka");
	  
	  System.out.println("HashMap Capital : " + Capital.get("Pakistan"));
	//Hashset store unordered collection containing unique value, Implementation of Set Interface
	
	HashSet<String> car = new HashSet<String>();
	car.add("BMW");
	car.add("Toyota");
	car.add("Tesla");
	car.add("Audi");
	System.out.println("Car : " + car);
	
	//HashTable store multiple data using key-value pair, No duplicate
	 //also is synchronized (only one thread can be modified
	 
	 Hashtable<String, String > Region= new Hashtable <String, String > ();
	 Region.put("BD", "Asia");
	 Region.put("USA", "America");
	 System.out.println("Region: " + Region.get("BD"));
	
	}

}

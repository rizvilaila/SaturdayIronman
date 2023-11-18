package com.upskill.java_1_4;

import java.util.HashMap;
import java.util.HashSet;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		// Array store multiple data using index
		int age = 30;                   //Variable Array
		int [] ageVision = new int [] {21, 26, 28, 30, 35};
		
		//Array index            [0] [1] [2] [3] [4]
System.out.println("Student Age : " + ageVision [2]);
System.out.println("Total Student : " + ageVision.length);

String [] nameVision = new String []{"Laila" , "Riyan" , "Shishir", "Samiul" , "Rasel"};
System.out.println("Student Name : "  + nameVision [2]) ;
System.out.println("Total Student Name : "  + nameVision.length) ;
  
// Hashmap store multiple data using Key-value Pair, Implementation of Map interface

  HashMap<String, Integer > Student = new HashMap<String, Integer > ();

  Student.put("laila", 21);
  Student.put("Riyan", 19);
  Student.put("samiul", 24);
  Student.put("Shishir", 23);
  Student.put("Rasel", 26);
  
  System.out.println("Hashmap Student Age : " + Student.get("Riyan"));
  
  
  HashMap<String, String > Capital= new HashMap<String, String > ();
  Capital.put("Pakistan", "isb");
  Capital.put("Bangladesh", "dhaka");
  
  System.out.println("Capital City: " + Capital.get("Pakistan"));
  

	//HashTable store multiple data using key-value pair, No duplicate, also is synchronized (only one thread can be modified)

 HashSet<String> car = new HashSet<String>();
 car.add("Tesla");
 car.add("toyota");
 car.add("audi");
 car.add("honda");
 car.add("BMW");
 
 System.out.println("Car : "+ car);
 
 //HashTable store multiple data using key-value pair, No duplicate
 //also is synchronized (only one thread can be modified
 
 Hashtable<String, String > Region= new Hashtable <String, String > ();
 Region.put("BD", "Asia");
 Region.put("USA", "America");
 System.out.println("Region: " + Region.get("BD"));
 
 }
}

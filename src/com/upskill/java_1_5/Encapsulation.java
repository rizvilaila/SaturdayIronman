package com.upskill.java_1_5;

public class Encapsulation {

	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "Rasel"  ; //Write & Read
	private int ssn = 123456;         //Write only
	private String username = "Upskill" ;
	//Read only
	
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation ();
		obj.setSSN(456123654);
		System.out.println(obj.getUsername());
		
		obj.setName("Laila");
		System.out.println (obj.getName());
		
		}
//Setter method - ssn
	public void setSSN(int value) {
		ssn = value;
		
	}
	//Getter Method - username
	public String getUsername() {
		return username;
		
	}
	public void setName(String value) {
		name = value;
}
	public String getName() {
		return name;
}
}
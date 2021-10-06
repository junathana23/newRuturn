package com.qa.demo;

public class Conditional {
	public static void kettleDemo() {
		boolean kettleOn = false;
		
		if(kettleOn == true) {
			System.out.println("The kettle is on");
		} else if (kettleOn == false) {
			System.out.println("The Kettle is off");
		}
	}
	
	public static void numberDemo() {
		
		int number = 20;
		
		if (number > 10) {
			System.out.println("it is greater than 10");
		} else if (number < 10 ) {
			System.out.println("this number is less than 10");
			
		} else if (number == 10 ) {
			System.out.println("this is 10");
		} 
		
	}
	
	public static void oddEvenDemo() {
		int number = 20;
		
		if (number % 2 == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}
	}
	
	public static void complexCondits() {
		
		int number = 15;
		String colour = "red";
		
		if (number < 10 && colour == "red") {
			System.out.println("True!");
			
		} else {
			System.out.println("False!");
		}
	}
	


	

}

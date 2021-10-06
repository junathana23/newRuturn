package com.qa.demo;

public class Runner {
	public static void main (String[]args) {
		
//		printNum(23);
		
		printDetails("junathan", true, 23);
		printInt(23);
		
	}
//	public static String helloStudent(String name) {
//		System.out.println("Hello " + name );
//		return name; 
//	}
//	
//	public static void printNum(int num) {
//		System.out.println("The number is " + num);
//		
//	}
//	
	public static void printDetails(String name, boolean pineZa, int favNum) {
		
		System.out.println("My name is " + name + "pinapple on pizza is good: " + pineZa + ", my favorite number is: " + favNum );
	}
	
	public static void printInt(int number) {
		System.out.println("my favourite number is " + number);
	}
	

}

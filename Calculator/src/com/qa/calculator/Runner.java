package com.qa.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
public static void main(String[] args) {
	
	
	
	 Scanner scanner1  = new Scanner(System.in);
	 CalcMethods method = new CalcMethods();
	 
	 String operator;
	 
	 try {
	 
	 System.out.println("please input your first number");
	
	 int cal1 = scanner1.nextInt();
	 
	 Scanner scanner2  = new Scanner(System.in);
	 System.out.println("please enter your second number ");
	
	 int cal2 = scanner2.nextInt();
	 
	 Scanner scanner3  = new Scanner(System.in);
	 System.out.println("Please enter your operator ");
	 operator = scanner3.nextLine();
	
	 
	 switch(operator) {
	 
	 case "+":
		 System.out.println(CalcMethods.addcalc(cal1, cal2 ));
		 break;
	 case "-":
		 System.out.println(CalcMethods.minuscalc(cal1, cal2 ));
		 break;
	 case"/":
		 System.out.println(CalcMethods.multicalc(cal1, cal2  ));
	     break;
	 case "*":
		 System.out.println(CalcMethods.divcalc(cal1, cal2  ));
		 break;
	 case"%":
		 System.out.println(CalcMethods.modcalc(cal1, cal2 ));
		 break;
	default:
		System.out.println("default");
		break;
		 
	 }} catch(InputMismatchException e){
		 System.out.println("please try again and enter a valid operator");
	 }
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
}
}

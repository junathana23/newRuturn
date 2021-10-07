package com.qa.demo;

public class Runner {
	public static void main(String[] args) {
		Conditional.redDemo("green");
		System.out.println(Conditional.numDemo(5, 2, 4));
		System.out.println(Conditional.numStr(1));
		
		String number = Conditional.numStr(3);
		System.out.println(number);
	}

}

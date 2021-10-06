package com.qa.calculator;

public class Runner {
public static void main(String[] args) {
	int cal1 = 56;
	int cal2 = 7;
	int cal3 = 10;
	
	System.out.println(CalcMethods.addcalc(cal1, cal2, cal3 ));
	System.out.println(CalcMethods.minuscalc(cal1, cal2, cal3 ));
	System.out.println(CalcMethods.multicalc(cal1, cal2, cal3 ));
	System.out.println(CalcMethods.divcalc(cal1, cal2, cal3 ));
	System.out.println(CalcMethods.modcalc(cal1, cal2 ));
	
}
}

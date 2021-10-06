package com.qa.demo;

import com.qa.numPackage.NumPack;
import com.qa.printer.Printer;

// each project should only have one runner
// the runner should only contain the main method 
public class Runner {
	public static void main(String[] args) {
		Printer.printsHello();
		NumPack.printnum();
	}

}

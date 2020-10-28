package com.company.calculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("a =");
		byte a = myObj.nextByte();

		System.out.println("b =");
		byte b = myObj.nextByte();

		
		int c = a + b;
		
		System.out.println("addition is : " + c);
		
		
		
		
	}

}

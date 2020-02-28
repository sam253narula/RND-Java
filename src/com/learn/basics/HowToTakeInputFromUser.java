package com.learn.basics;

import java.util.Scanner;

public class HowToTakeInputFromUser {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide an Integer value");
		System.out.println("Integer Value a: "+ sc.nextLine());
		System.out.println("provide the float value");
		float f = sc.nextFloat();
		System.out.println("float value "+ f);
		sc.nextLine();
		System.out.println("Provide string value");
		System.out.println("String value "+ sc.nextLine());
		System.out.println("Provide a double value ");
		double d = sc.nextDouble();
		System.out.println("Double value " + d);

		
//		System.out.println("Provide an Integer value");
//		//in order to take a integer input from console
//		int i = sc.nextInt();
//		//printing the interger value which is stored in i
//		System.out.println("Integer Value a: " + i);
//		//in order to take a integer input from console
//		System.out.println("Provide a short value");
//		short s = sc.nextShort();
//		System.out.println("short value " + s);
////		System.out.println(" provide a double value ");
////		double d = sc.nextDouble();
////		System.out.println("Double value " + d);
//		System.out.println("provide the string value");
//		String test = sc.nextLine();
//		System.out.println("String value " + test );
////		System.out.println("provide the float value");
////		float f = sc.nextFloat();
////		System.out.println("float value "+ f);
		
	}
}

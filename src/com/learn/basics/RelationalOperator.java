package com.learn.basics;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a");
		int a = sc.nextInt();
		System.out.println("enter value of b");
		int b = sc.nextInt();
		if (a > b)
			System.out.println("true");
		else
			System.out.println("false");
		if (a >= b)
			System.out.println("true");
		else
			System.out.println("false");
		if (a < b)
			System.out.println("true");
		else
			System.out.println("false");
		if (a <= b)
			System.out.println("true");
		else
			System.out.println("false");
		if (a == b)
			System.out.println("true");
		else
			System.out.println("false");
		if (a != b)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
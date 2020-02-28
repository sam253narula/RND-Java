package com.learn.basics;

import java.util.Scanner;

public class LearnSwitchCases {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the marks");
int n = sc.nextInt();
//int A,B,C,D;

switch (n/10) {
case 1:
case 2:
case 3:
	System.out.println("fail");
	break;
case 4:
case 5:
case 6:
	System.out.println("first ");
	break;
case 7 :
default:System.out.println("not a valid entry please provide a valid integer from 0 to 100");

}
}

}
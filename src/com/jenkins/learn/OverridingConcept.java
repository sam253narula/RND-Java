package com.jenkins.learn;

public class OverridingConcept {
	  static int plusMethod(int x, int y) {
	    return x + y;
	  }
	  
	  static double plusMethod(double x, int y) {
	    return x + y;
	  }
	  
	  static double plusMethod(int y, double x) {
		    return x + y;
	  }
	  
	  public static void main(String[] args) {
	    int myNum1 = plusMethod(8, 5);
	    double myNum2 = plusMethod(8, 5);
	    double myNum3 = plusMethod(5, 5.5);
	    System.out.println("int: " + myNum1);
	    System.out.println("double: " + myNum2);
	    
	  }
	}
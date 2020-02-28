package com.learn.basics;

public class StringArrayAndAllArrays {

	public static void main(String[] args) {
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	

	for(String t: cars) {
		System.out.println(t);
	}
	
	String[] animals = new String[5];
	animals[0] = "cat";
	System.out.println(howAboutMe());
}
	
	private static String howAboutMe() {
		return "Fine";
	}
}
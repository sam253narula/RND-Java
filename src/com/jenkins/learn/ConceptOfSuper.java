package com.jenkins.learn;

public class ConceptOfSuper {

	public static void main(String[] args) {
		Vehicle vh = new Car();
	
	}

}

class Vehicle{
	
	public Vehicle() {
		System.out.println("inside defualt Vehicle constructor");
	}
}
class Car extends Vehicle{
	
	public Car() {
		super();
		System.out.println("inside defualt car constructor");
	}
}
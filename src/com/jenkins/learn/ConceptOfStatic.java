package com.jenkins.learn;

public class ConceptOfStatic {

	public static void main(String[] args) {
		int cat= 10; // local variable
		Multiply m  = new Multiply();
		Multiply m1 = new Multiply();
		Multiply.add =10;
		Multiply.add = 5;
		m.sub = 20;
		m1.sub = 25;
		System.out.println(m.sub);
		System.out.println(m1.sub);
		System.out.println(Multiply.add);
	}

}

class Multiply{
	static int add; //class variable
	int sub;  //instance variable 
}

package com.jenkins.learn;

public class ConceptOfSuperWithoutInheritance {
	public static void main(String[] args) {
		Vehicle3 vh3 = new Vehicle3();
		System.out.println(vh3.vh.horn());
	}

}

class Vehicle3 {
	public Vehicle3() {
		System.out.println("Vh3 default const");
	}

	 Vehicle2 vh = new Vehicle2() {
		String horn() {
			String t = super.horn();
			System.out.println(t);
			return "blowing horn here";
		}
	};
}

class Vehicle2 {

	String horn() {
		return "Pepe";
	}

}

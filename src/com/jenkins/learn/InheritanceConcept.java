package com.jenkins.learn;

import java.util.Scanner;

public class InheritanceConcept {

	public static void main(String[] args) {
		System.out.println("What type of animal?");
		AnimalT myPreferedAnimal = giveMeMyAnimal();
		System.out.println(myPreferedAnimal.speak());
		
	}

	private static AnimalT giveMeMyAnimal() {
		Scanner sc = new Scanner(System.in);
		String animalType = sc.next();
		AnimalT myPreferedAnimal = AnimalFactory.get(animalType);
		sc.close();
		return myPreferedAnimal;
	}

}

class AnimalFactory{
	public static AnimalT get(String t) {
		if(t.equalsIgnoreCase("dog")) {
			return new Dog();
		}
		else if(t.equalsIgnoreCase("cat")) {
			return new Cat();
		}
		return new AnimalT();
	}
	
}

class AnimalT {

	public String speak() {
		String s = "default";
		return s;
	}
}

class Dog extends AnimalT {

	public String speak() {
		String s = "bark";
		return s;
	}
}

class Cat extends AnimalT {

	public String speak() {
		String s = "meow";
		return s;
	}
}

package com.jenkins.learn;

public class ConceptOfImmutable {

	public static void main(String[] args) {
		ImmutableAnimal a1 = new ImmutableAnimal("Tommy", "5");
		System.out.println(a1.getName() + a1.getAge());
		String temp = "kavya";
		temp = "sam";
		System.out.println(temp);
	}


}

final class ImmutableAnimal{
	
	private final String name;
	private final String age;
	
	public ImmutableAnimal(String name, String age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	
}
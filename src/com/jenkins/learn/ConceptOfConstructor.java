package com.jenkins.learn;

public class ConceptOfConstructor {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.firstName = "sam";
		System.out.println(emp1.firstName);
		Employee emp2 = new Employee(10, "Kavya");
		System.out.println(emp2.id + " name = " + emp2.firstName);
	}
}

class Employee{
	int id;
	String firstName;
	String lastName;

	public Employee() {
	// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name) {
		this.id = id;
		this.firstName = name;
	}
	
}

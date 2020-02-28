package com.practice.interfac;

public class TestingIfConceptWithInterface {

	public static void main(String[] args) {
		StudentInterface calculator = new StudentsEffectivenessCalculator();
		//System.out.println(calculator.sports(9));
		int percentage = calculator.percentage(50, 50, 50);
		System.out.println("percentage= "+ percentage + "%");
	}

}

package com.practice.interfac;

public class StudentsEffectivenessCalculator implements StudentInterface {

//	@Override
//	public int percentage(int maths, int science, int java) {
//
//		int sum = (maths + science + java);
//		double divide =(double) sum / 500;
//		int result = (int) (divide * 100);
//		return result;
//	}

	String randomMethod(String somethingRandom) {

		return somethingRandom;
	}

	@Override
	public String sports(int numberOfBatmintonMatchesWon) {

		if (numberOfBatmintonMatchesWon <= 5) {
			return "Bad Player";
		}

		else if (numberOfBatmintonMatchesWon <= 8) {
			return "Good Player";
		}

		else if (numberOfBatmintonMatchesWon <= 10) {
			return "Proficient Player";
		}

		else {
			return "Provide a value less than 10";
		}

	}

}

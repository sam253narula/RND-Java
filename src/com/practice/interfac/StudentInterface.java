package com.practice.interfac;

/**
 * @author samarth
 *
 */
public interface StudentInterface {

	default int percentage(int maths, int science, int java) {
		int sum = maths + science + java;
		double divide =(double)  sum/300;
		int result = (int) (divide * 100);
		return result;
	}

	/**
	 * The match won will be out of 10, if the player wins 5 or less than 5 matches
	 * he is a bad player, if they win more than 5 and less than 8 they are good
	 * player if they win ore than 8 and less than or equal to 10 they are
	 * proficient players
	 */
	String sports(int numberOfBatmintonMatchesWon);

}

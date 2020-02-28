package com.practice.interfac;

public abstract class StudentAbstract {

	  int percentage(int maths, int science, int java) {
		  int result = (maths + science + java) / 300 * 100;
			return result;
	  }
	 
	 /**
	  * The match won will be out of 10, if the player wins
	  *  5 or less than 5 matches he is a bad player,
	  *   if they win more than 5 and less than 8 they are good player
	  *   if they win  ore than 8 and less than or equal to 10 they are proficient players
	  */
	 abstract String sports(int numberOfBatmintonMatchesWon);
}

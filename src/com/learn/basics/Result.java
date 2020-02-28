package com.learn.basics;

import java.util.Calendar;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
	///protected static final String NAME= "sam";
	
    public static void main(String[] args) {
    	//create Calendar instance
    	//private static final String name= "sam";
    	  final String NAME= "sam";
    	System.out.println(NAME);
        Calendar now = Calendar.getInstance();
        System.out.println(now);
       String[] strDays = new String[]{
                  "SUNDAY",
                  "MONDAY", 
                  "TUESDAY",
                  "WEDNESDAY",
                  "THURSDAY",
                  "FRIDAY",
                  "SATURDAY"
                };
        now.set(2015, 8, 5);
        System.out.println(now);
         System.out.println(strDays[now.get(Calendar.DAY_OF_WEEK) -4]);
	}
           
}
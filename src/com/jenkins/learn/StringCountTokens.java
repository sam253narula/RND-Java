package com.jenkins.learn;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class StringCountTokens {
	
	public static void main(String[] args){
		
		
			String REGEX = "[AZ[a-z](a-z)";
			try {
			Pattern pattern = Pattern.compile(REGEX);
			System.out.println("Valid");
			}
			catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
			
          	//Write your code
              
	}}

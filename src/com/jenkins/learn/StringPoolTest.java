package com.jenkins.learn;

public class StringPoolTest {
	
	public static void main(String[] args) 
    { 
        String s1 = "java"; 
        String s2 = s1.concat(" rules"); 
  
        // Yes, s1 still refers to "java" 
        System.out.println("s1 refers to " + s1); 
        System.out.println("s1 refers to " + s2);
    } 
}

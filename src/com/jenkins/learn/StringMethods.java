package com.jenkins.learn;

public class StringMethods {

	public static void main(String[] args) {
	
	String word1 = "Learn Share Learn";
	word1 = "sfdfgfgdf";
	System.out.println(word1);
	
	String s="Sachin";  
	s.concat(" Tendulkar");  
	//System.out.println("Sachin".concat(" Tendulkar"));    //concat() method appends the string at the end  
	   System.out.println(s);//will print Sachin because strings are immutable objects 
	String[] word2 = word1.split(" ");
	for(String temp : word2) {
		System.out.println(temp);

	}
	
}
}

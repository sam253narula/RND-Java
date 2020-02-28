package com.springboot.practical.designs.example;

public class test extends Some {

	public static void main(String[] args) {
		Some s  = new test();
		s.doYouKnow();
		Some.someshit();
		String a = "a";
		String b= "a";
		System.out.println(a == b);
	}
	
	static void someshit() {
		 System.out.println("try more");
	 }

}
 abstract class Some{
	 static void someshit() {
		 System.out.println("try");
	 }
	 void doYouKnow() {
		 System.out.println("maybe");
	 }
 }

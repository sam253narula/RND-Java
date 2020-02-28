package com.jenkins.learn;

import com.learn.basics.A;

public class B extends A{

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.msg());
		b.publicMsg();
		
	}
}

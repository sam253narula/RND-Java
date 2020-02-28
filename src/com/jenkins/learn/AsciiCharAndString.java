package com.jenkins.learn;

public class AsciiCharAndString {

	public static void main(String[] args) {
		
		byte[] b_arr = {71, 101, 101, 107, 115};
		String s_byte =new String(b_arr);
		System.out.println(s_byte);
		char[] charArr = new char[300];
		for(int i=33; i<300; i++) {
			charArr[i] = (char) i;
			System.out.println("integer is "+ i + " char is "+ charArr[i]);
		}
	}

}

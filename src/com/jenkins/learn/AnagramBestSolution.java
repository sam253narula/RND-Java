package com.jenkins.learn;

public class AnagramBestSolution {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		 String a = "TestTest";
		 String b = "testsest";
		System.out.println( anagramOrNot(a, b));
	}

	private static Boolean anagramOrNot(String a, String b) {
		if(a.length() != b.length()) return false;
        int c[] = new int[26], d[] = new int[26] ;
        a = a.toUpperCase();
        b = b.toUpperCase();
        for(int i=0; i<a.length(); i++){
        	//System.out.println(a.charAt(i));
            c[a.charAt(i) - 'A']++;
            d[b.charAt(i) - 'A']++;
        }
        for(int i =0;i<26; i++)
            if(c[i] != d[i] ) return false;
        return true;
	}

}

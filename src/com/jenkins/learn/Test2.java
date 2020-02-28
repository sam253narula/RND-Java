package com.jenkins.learn;

public class Test2 {

	public static void main(String[] args) {
		for (int i = 65; i <= 90; i++) {
			char c = (char) i;
			// int i = c;
			System.out.print(c + " ");
			System.out.print(i);
			System.out.println("");
			
		}
	}
		
//		if(a.length() != b.length()) return false;
//        int c[] = new int[26], d[] = new int[26] ;
//        a = a.toUpperCase();
//        b = b.toUpperCase();
//        for(int i=0; i<a.length(); i++){
//            c[a.charAt(i) - 'A']++;
//            d[b.charAt(i) - 'A']++;
//        }
//        for(int i =0;i<26; i++)
//            if(c[i] != d[i] ) return false;
//        return true;
//	}

}

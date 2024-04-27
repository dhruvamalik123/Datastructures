package com.datastructure.strings;

public class palindrome {
	public static void main(String[] args) {
		String s="Dhruva is";
		validpalindrome(s);
	}

	private static void validpalindrome(String s) {
		s=s.toLowerCase();
		StringBuilder str= new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='a' && s.charAt(i)<='z'){
				str.append(s.charAt(i));
			}
		}
		System.out.println(str);
	}

}

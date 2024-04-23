package com.datastructure;

public class ReverseVowelsOfAString {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(reverseVowels(s));
	}

	public static String reverseVowels(String s) {
		String str = "";
		for (int i = s.length()-1; i >=0; i--) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'E' || s.charAt(i) == 'e' || s.charAt(i) == 'I' || s.charAt(i) == 'i' || s.charAt(i) == 'O' || s.charAt(i) == 'o' || s.charAt(i) == 'U' || s.charAt(i) == 'u') {
				str += s.charAt(i);
			}
		}
		System.out.println(s);
		int j = 0;
		String newstr="";
		for (int i = 0 ; i < s.length() ; i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'E' || s.charAt(i) == 'e' || s.charAt(i) == 'I' || s.charAt(i) == 'i' || s.charAt(i) == 'O' || s.charAt(i) == 'o' || s.charAt(i) == 'U' || s.charAt(i) == 'u') {
//				System.out.println(s.charAt(i)+" "+str.charAt(j));
				newstr=newstr+str.charAt(j);
				j++;
			}
			else{
				newstr=newstr+s.charAt(i);
			}
		}

		return newstr;
    }


}

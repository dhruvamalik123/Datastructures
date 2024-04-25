package com.datastructure.strings;

public class palindromestring {
	public static void main(String[] args){
		String str="";
		String res=palindrom(str);
		System.out.println(res);
	}

	public static String palindrom(String str) {
		if(str.length()==0){
			return "Its a palindrome";
		}
		for(int i=0;i<=str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				return "Not a palindrome";
			}
		}
		return "Its a palindrome";
	}
}

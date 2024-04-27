package com.datastructure.important;

public class noofdigits {
	public static void main(String[] args) {
		//program to calculate number of digits in a number
		int n=9;
		int base=2;
		System.out.println(~1);
		System.out.println(digitsdecimal(n));
		System.out.println(digitsbase(n,base));
		String str="Dhruva";
		str=str.toLowerCase();
		System.out.println(str);
		StringBuilder stri=new StringBuilder();
		stri.append("a");
		System.out.println(stri);

	}

	private static int digitsbase(int n, int base) {
		return (int)((Math.log10(n))/(Math.log10(2))+1);
	}

	private static int digitsdecimal(int n) {
		return (int)((Math.log10(n))+1);
	}

}

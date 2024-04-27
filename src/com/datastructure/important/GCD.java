package com.datastructure.important;

public class GCD {
	public static void main(String[] args) {
		int a=225 ;
		int b=105;
		int k=gcd(a,b);
		System.out.println(k);
		int l=lcm(a,b);
		System.out.println(l);
	}

	private static int lcm(int a, int b) {
		int v=Math.abs(a*b);
		int g=gcd(a,b);
		return v/g;

	}

	private static int gcd(int a, int b) {
		if(a==0){
			return b;
		}
		return gcd(b%a,a);
	}
}

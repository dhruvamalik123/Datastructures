package com.datastructure.recursion;

public class printincreasing {
	public static void main(String[] args) {
		int n=5;
		int s=1;
		printIncreasing(n);
	}

	private static void printIncreasing(int n) {
		if(n==1){
			System.out.println(n);
			return;
		}
//		System.out.println(s);
		printIncreasing(n-1);
		System.out.println(n);
	}
}

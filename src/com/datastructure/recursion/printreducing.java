package com.datastructure.recursion;

public class printreducing {
	public static void main(String[] args) {
		int n=5;
		printReducing(n);
	}

	private static void printReducing(int n) {
		if(n==1){
			System.out.println(1);
			return;
		}
		System.out.println(n);
		printReducing(n-1);
	}
}

package com.datastructure.recursion;

public class factorial {
	public static void main(String[] args) {
		int n=5;
		int res=productn(n);
		System.out.println(res);
	}

	private static int productn(int n) {
		if(n==1){
			return 1;
		}
		return n*productn(n-1);
	}
}

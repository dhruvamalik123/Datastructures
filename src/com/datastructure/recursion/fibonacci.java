package com.datastructure.recursion;

public class fibonacci {
	public static void main(String[] args) {
		// 0 1 1 2 3 5 8
		int k=fibo(4);
		System.out.println(k);
	}


	public static int fibo(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}else{
			return fibo(n-1)+fibo(n-2);
		}
	}
}

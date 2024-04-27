package com.datastructure.important;

public class findprimes {
	public static void main(String[] args) {
		int count = 0;
		int flag = 0;
		int n=3;
		for (int i = 2; i < n; i++) {
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				count += 1;
			}
			flag = 0;
		}
		System.out.println(count);
		//Sieve of Eratosthenes method for finding number of primes between a range;
		int num=40;
		boolean[] primes=new boolean[num+1];
		sieve(num,primes);



	}

	private static void sieve(int num, boolean[] primes) {
		for(int i=2;i*i<=num;i++){
			if(!primes[i]){
				for(int j=i*2;j<=num;j=j+i){
					primes[j]=true;
				}
			}
		}
		for(int i=2;i<=num;i++){
			if(!primes[i]){
				System.out.print(i+" ");
			}
		}
	}
}

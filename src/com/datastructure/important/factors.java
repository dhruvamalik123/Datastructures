package com.datastructure.important;

import java.util.ArrayList;

public class factors {
	public static void main(String[] args) {
		int n=12;
		int k=3;
		ArrayList<Integer> arr1=new ArrayList<>();
		ArrayList<Integer> arr2=new ArrayList<>();

		for(int i=1;i<=Math.sqrt(n);i++){
			if(n%i==0){
				arr1.add(i);
				if(i!=(n/i)) {
					arr2.add(n / i);
				}
			}
		}
		if(k <= arr1.size()){

			System.out.println( arr1.get(k-1));
		}
		else{
			k=k-arr1.size();
			if(k>arr2.size()){
				System.out.println(-1);
			}
			else {
				System.out.println(arr2.get(arr2.size() - k));
			}
		}
	}
}

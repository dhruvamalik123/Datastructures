package com.datastructure.sort;

import java.util.Arrays;

public class cyclesort {
	public static void main(String[] args){
		int[] arr={3,5,2,1,4};
		int i=0;
		while(i<arr.length){
			if(arr[i]-1!=i){
				int temp=arr[arr[i]-1];
				arr[arr[i]-1]=arr[i];
				arr[i]=temp;
			}
			else{
				i++;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}

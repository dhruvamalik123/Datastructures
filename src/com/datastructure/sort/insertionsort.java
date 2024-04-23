package com.datastructure.sort;

import java.util.Arrays;
//its adaptive, as the steps get reduced if the first part of the array is sorted
//stable
//good for small arrays and partially sorted arrays
public class insertionsort {
	public static void main(String[] args){
		int[] arr={3,1,-2,5,-4};
		for(int i=0;i<arr.length-1;i++){
//			System.out.println(Arrays.toString(arr));
			for(int j=i+1;j>0;j--){
//				System.out.println(arr[j]+" "+arr[j-1]);
				if (arr[j]<arr[j-1]){
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				else{
					break;
				}
				System.out.println(Arrays.toString(arr));
			}

		}
		System.out.println(Arrays.toString(arr));
	}
}

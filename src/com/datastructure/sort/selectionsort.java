package com.datastructure.sort;

import java.util.Arrays;

public class selectionsort {
	public static void main(String[] args){
		int[] arr={ 5,4,4,3,2,2,1};
		for(int i=0;i<arr.length-1;i++){
			int max=arr[0];
			int index=0;
			for(int j=0;j<arr.length-i;j++){
				if(arr[j]>max){
					max=arr[j];
					index=j;
				}
				System.out.println(j);
			}
			int temp=arr[arr.length-1-i];
			arr[arr.length-1-i]=max;
			arr[index]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}

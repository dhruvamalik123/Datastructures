package com.datastructure.sort;

import java.util.Arrays;
//also known as sinking sort or exchange sort
//also known as inplace sorting algorithm
//this is a stable sorting algorithm
//which means that the order for the duplicate numbers is maintained after sorting
public class bubblesort {
	public static void main(String[] args) {
		int[] arr = {2,-1};
		int passcounter=0;
		int swap=0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-passcounter ;j++){
				if (arr[j]>arr[j+1]){
//					swap(arr[j],arr[j+1]);
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap++;
				}
				System.out.println(j);
			}
			if(swap>0){
				swap=0;
			}else{
				break;
			}
			passcounter++;
		}
		System.out.println(Arrays.toString(arr));


	}

//	private static void swap(int num1, int num2) {
//		int temp=num1;
//		num1=num2;
//		num2=temp;
//	}
}

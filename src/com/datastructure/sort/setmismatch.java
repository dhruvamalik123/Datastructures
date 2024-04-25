package com.datastructure.sort;

import java.util.Arrays;

public class setmismatch {
	public static void main(String[] args){
		int[] arr={4,2,1,2};
		cyclicsort(arr);
		System.out.println(Arrays.toString(arr));
		int[] res=new int[2];
		for(int i=0;i<arr.length;i++){
			if (arr[i]-1 != i){
				res[0]=arr[i];
				res[1]=i+1;
				break;
			}
		}
		System.out.println(Arrays.toString(res));

	}
	public static void cyclicsort(int[] arr) {
		int i = 0;
		int swap = 0;
		while (i < arr.length) {
			if (arr[i] - 1 != i && arr[i] != arr[arr[i] - 1]) {
				// int first=i;
				// int second=arr[i]-1;
				int temp = arr[arr[i] - 1];
				arr[arr[i] - 1] = arr[i];
				arr[i] = temp;
			} else {
				i++;
			}
			// System.out.println(Arrays.toString(arr));
		}
	}
}

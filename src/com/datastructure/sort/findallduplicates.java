package com.datastructure.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findallduplicates {
	public static void main(String[] args){
		int[] arr={4,3,2,7,8,2,3,1};
		cyclicsort(arr);
		System.out.println(Arrays.toString(arr));
		List<Integer> arrays=new ArrayList<>();
		// int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]-1 != i) {
				arrays.add(arr[i]);
				// count++;
			}
			// }
			// int[] array=new int[count];
			// for (int i = 0; i < count; i++) {
			// 	array[i]=arrays.get(i);
			// List<Integer> arrayres=arrays.toArray(new Integer[0]);

		}
		System.out.println(arrays);
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

package com.datastructure.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findthemissingelement {
	public static void main(String[] args) {
		int[] arr = {3,1,3,4,2};
//		String[] arr2={"blah","blah"};
		cyclicsort(arr);
		System.out.println(Arrays.toString(arr));
		ArrayList<Integer> array=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]-1 != i) {
				System.out.println(arr[i]);
			}
		}
//		List<Integer> aris=new List<>;
//
//		for (int i = 0; i < array.size(); i++) {
//			array[i];
//		}
//		Integer[] arrayres=array.toArray(new Integer[0]);
//		System.out.println(Arrays.toString(arrayres));


	}

	public static void cyclicsort(int[] arr) {
		int i = 0;
		int swap=0;
		while (i < arr.length) {
			if (arr[i]-1 != i && arr[i]!=arr[arr[i]-1]) {
//				int first=i;
//				int second=arr[i]-1;
				int temp = arr[arr[i]-1];
				arr[arr[i]-1] = arr[i];
				arr[i] = temp;
			} else {
				i++;
			}
//			System.out.println(Arrays.toString(arr));
		}
	}
}

package com.datastructure.sort;

import java.util.Arrays;

public class firstmissingpositive {
	public static void main(String[] args) {
		int[] arr={1};
		int res=firstMissingPositive(arr);
		System.out.println(res);
	}
	public static int firstMissingPositive(int[] arr) {
		cyclicsort(arr);
		System.out.println(Arrays.toString(arr));
		// int found = 1;
		if (arr.length == 1) {
			if (arr[0] < 1) {
				return 1;
			} else if (arr[0] > 1)
				return 1;
			else {
				return 2;
			}
		}
		if(arr[0]!=1){
			return 1;
		}
//		int found = 0;
//		if (arr[0] != 1) {
//			found=1;
//			System.out.println("Here 4");
//			for (int i = 1; i < arr.length; i++) {
//				// if (arr[i] == i) {
//				// // System.out.println(i);
//				// found += 1;
//				// }
//				if (arr[i] != i) {
//					return (i);
//					// break;
//				}
//			}
//		}
// 	else {
//			found=2;
			for (int i = 0; i < arr.length; i++) {
				// if (arr[i] == i) {
				// // System.out.println(i);
				// found += 1;
				// }
				if (arr[i] != i+1) {
					System.out.println("Here 3");
					return (i + 1);
					// break;
				}
			}

//		if(found==1){
//			System.out.println("Here 1");
//			return (arr.length);
//		} else{
//			System.out.println("Here 2");
//			return (arr.length+1);
//		}
		return (arr.length+1);

	}

	public static void cyclicsort(int[] arr) {
		int i = 0;
		int swap = 0;
		while (i < arr.length) {
//			if (arr[i] > arr.length - 1 || arr[i] <=0) {
//				i++;
			if (arr[i]>0 && arr[i]<arr.length && arr[i]-1 != i && arr[i] != arr[arr[i]-1]) {
				// int first=i;
				// int second=arr[i]-1;
				int temp = arr[arr[i]-1];
				arr[arr[i]-1] = arr[i];
				arr[i] = temp;
			} else {
				i++;
			}
			// System.out.println(Arrays.toString(arr));
		}
	}
//		int[] arr = {2,1};
//		cyclicsort(arr);
//		System.out.println(Arrays.toString(arr));
//		int found = 0;
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] == i) {
////				System.out.println(i);
//				found += 1;
//			}
//			if (arr[i] !=i){
//				System.out.println(i);
//				break;
//			}
//		}
//		if (found == 0) {
//			System.out.println(1);
//		}
//		else {
//			System.out.println(found);
//		}
//
//	}
//
//	public static void cyclicsort(int[] arr) {
//		int i = 0;
//		int swap = 0;
//		while (i < arr.length) {
//			if (arr[i] > arr.length - 1 || arr[i] <=0) {
//				i++;
//			} else if (arr[i] != i && arr[i] != arr[arr[i]]) {
//				// int first=i;
//				// int second=arr[i]-1;
//				int temp = arr[arr[i]];
//				arr[arr[i]] = arr[i];
//				arr[i] = temp;
//			} else {
//				i++;
//			}
//			// System.out.println(Arrays.toString(arr));
//		}
//	}
}


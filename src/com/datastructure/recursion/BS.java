package com.datastructure.recursion;

public class BS {
	public static void main(String[] args) {


		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		int target = 9;
		int start = 0;
		int end = arr.length - 1;
		int res = binarysearch(arr, target, start, end);
		System.out.println(res);
	}

	public static int binarysearch(int[] arr, int target, int start, int end) {
		int mid = start + (end - start) / 2;
		if (start > end) {
			return -1;
		}
		if (arr[mid] == target) {
			return mid;
		}

		if (arr[mid] > target) {
			return binarysearch(arr, target, start, mid - 1);
		} else {
			return binarysearch(arr, target, mid + 1, end);
		}
	}
}

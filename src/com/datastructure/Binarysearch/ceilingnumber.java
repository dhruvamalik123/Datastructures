package com.datastructure.Binarysearch;

public class ceilingnumber {
	public static void main(String[] args) {
		int[] arr = {2,3,5,9,14,16,18};
		int target = 15;
		int res = ceilingNumber(arr, target);
		System.out.println(res);
	}


	private static int ceilingNumber(int[] arr, int target) {
			int start = 0;
			int end = arr.length - 1;
			int result=0;
			while (start <= end) {
				int mid = start + (end - start) / 2;
				result=mid;
				if(arr[mid]==target){
					return arr[mid];
				}
				else if(target>arr[mid]){
					start=mid+1;
				}
				else{
					end=mid-1;
				}
			}
//			if(target<arr[result]){
//				return arr[result];
//			}
//			return arr[result+1];
		//using mid is also correct, here result=mid
		// if we are calculating floor of a number, we can return end instead of start
			return arr[start];
		}
	}


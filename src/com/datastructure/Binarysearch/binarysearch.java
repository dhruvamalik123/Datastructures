package com.datastructure.Binarysearch;

public class binarysearch {
	public static void main(String[] args){
		int[] arr={1,2,2,3,8};
		int target=1;
		int res=binarySearch(arr,target);
		System.out.println(res);
	}

	private static int binarySearch(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end){
//			int mid=(start+end)/2;
			int mid=start+(end-start)/2;
			if(arr[mid]==target){
				return mid;
			}
			else if(target>arr[mid]){
				start=mid+1;
			}
			else{
				end=mid-1;
			}
		}
		return -1;
	}
}

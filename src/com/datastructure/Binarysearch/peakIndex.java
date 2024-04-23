package com.datastructure.Binarysearch;

public class peakIndex {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,4,3,2};
		int res = peakIndexInMountainArray(arr);
		System.out.println(res);
	}

//this code can also be used to find peak in a sorted rotated array.

	private static int peakIndexInMountainArray(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end){
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1]){
				end=mid;
			}
			else if(arr[mid]<arr[mid+1]){
				start=mid+1;
			}
//			if(start==end){
//				return mid;
//			}
//			if(arr[mid]>arr[mid+1]){
//				end=mid;
//			}
////			else if(arr[mid]<arr[mid+1]){
////				start=mid+1;
////			}
//			else{
//				start=mid+1;
//			}


		}
		return start;
//		return -1;
//		while(start<=end){
//			int mid=start+(end-start)/2;
//			if(end-start==1){
//				return ((arr[start]<arr[end])?(end):(start));
//			}
//			if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){
//				return mid;
//			}
//			else if(arr[mid-1]<arr[mid] && arr[mid+1]>arr[mid]){
//				start=mid+1;
//			}
//			else{
//				end=mid-1;
//			}
//		}
//		return -1;
	}
}

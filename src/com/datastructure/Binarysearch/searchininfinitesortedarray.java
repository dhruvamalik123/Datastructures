package com.datastructure.Binarysearch;

import java.util.Arrays;

public class searchininfinitesortedarray {
	public static void main(String[] args){
	int[] arr = {2, 3, 5, 7, 8, 10, 11, 12, 15, 20, 23, 30,31,36,50,55,76,89,100};
	int target = 20;
	int start = 0;
	int end = 1;
	boolean found = false;
	int[] range = returnRange(arr, target, start, end);
	System.out.println(Arrays.toString(range));
	int index=binarySearch(arr,target,range[0],range[1]);
	System.out.println(index);
}


	private static int[] returnRange(int[] arr, int target, int start, int end) {
		int count=1;
		while(true){
			if(arr[start]<=target && arr[end]>=target){
				return new int[] {start,end};
			}
			else{
				count+=1;
				start= end+1;
				end=(int)(end+(Math.pow(2,count)));
			}
		}
	}
	private static int binarySearch(int[] arr, int target,int start, int end) {
//		int start=arr[0];
//		int end=arr.length-1;
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

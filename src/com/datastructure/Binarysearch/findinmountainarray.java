package com.datastructure.Binarysearch;

public class findinmountainarray {
	public static void main(String[] args){
		int target=2;
		int[] MountainArray={1,5,2};
		int result=findInMountainArray(target,MountainArray);
		System.out.println(result);

	}

	private static int findInMountainArray(int target, int[] mountainArray){
		int start=0;
		int end=mountainArray.length-1;
		while(start<end){
			int mid=start+(end-start)/2;
			if(mountainArray[mid]>mountainArray[mid+1]){
				end=mid;
			}
			else if(mountainArray[mid]<mountainArray[mid+1]){
				start=mid+1;
			}
		}
//		int res=-1;
		if(mountainArray[start]==target){
			return start;
		}
		int asc=binarySearch(mountainArray,target,0,start,true);
		int desc=binarySearch(mountainArray,target,start,mountainArray.length-1,false);
		if(asc==-1){
			asc=Integer.MAX_VALUE;
		}
		else if(desc==-1){
			desc=Integer.MAX_VALUE;
		}
		System.out.println(asc);
		System.out.println(desc);
		return (Math.min(asc, desc));

	}
	private static int binarySearch(int[] arr, int target,int start, int end,boolean flag) {
//		int start=arr[0];
//		int end=arr[arr.length-1];
		while(start<=end){
//			int mid=(start+end)/2;
			int mid=start+(end-start)/2;
			if(arr[mid]==target){
				return mid;
			}
			if(flag) {
			    if (target > arr[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
			else{
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}
}

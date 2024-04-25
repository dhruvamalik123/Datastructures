package com.datastructure.sort;

import java.util.Arrays;

public class smallnumthancurrent {
	public static void main(String[] args){
		int[] array={8,1,2,2,3};
		int[] nums=Arrays.copyOf(array,array.length);
		int[] k=smallerNumbersThanCurrent(array);
		System.out.println(Arrays.toString(k));
//		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(nums));
		int[] res=new int[array.length];
		for(int i=0;i<array.length;i++){
			for(int j=0;j< array.length;j++){
				if (nums[i]==k[j]){
//					System.out.println(j);
					res[i]=j;
					break;
				}
			}
		}
//			int ans=binarySearch(k,nums[i]);
//			System.out.println(ans);
//			res[i]=ans;
//			System.out.println(Arrays.toString(res));
		//}
		System.out.println(Arrays.toString(res));
//		return res;

	}
	public static int[] smallerNumbersThanCurrent(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			// System.out.println(Arrays.toString(arr));
			for (int j = i + 1; j > 0; j--) {
				// System.out.println(arr[j]+" "+arr[j-1]);
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				} else {
					break;
				}
				// System.out.println(Arrays.toString(arr));
			}
		}
		return arr;
	}

}

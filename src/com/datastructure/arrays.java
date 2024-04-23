package com.datastructure;

public class arrays {
    public static void main(String[] args){
//		int[] arr={1,2,3,4,5};
//	    System.out.println(max(arr));
//		reverse(arr);
////		System.out.println(k.length);
//		for(int i:arr){
//			System.out.println(i);
//		}
//	    ArrayList<Integer> list=new ArrayList<>();
	    int [][] arr2d={{1,2,3,4},{5,6},{7,8,9}};
		int target=7;
		int flag=0;
		for(int i=0;i<arr2d.length;i++){
			for(int j=0;j<arr2d[i].length;j++){
				if(target==arr2d[i][j]){
					System.out.println(i+" "+j);
					flag=1;
				}
			}
		}
		if(flag==0){
			System.out.println("Not Found");
		}
    }
// the following function reverse is a two pointer method
	private static void reverse(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}

	}

	private static int max(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
}

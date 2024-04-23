package com.datastructure.Binarysearch;

public class nextgreatestletter {
	public static void main(String[] args){
		char[] letters={'x','x','y','y'};
		char target='y';
		int resindex=nextGreatestLetter(letters,target);
		if(resindex>letters.length-1){
			System.out.println(letters[0]);
		}
		else{
			System.out.println(letters[resindex]);
		}
		System.out.println(resindex);


	}

	private static int nextGreatestLetter(char[] letters, char target) {
		int start = 0;
		int end = letters.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (letters[mid] == target) {
				 start=mid+1;
			} else if (target > letters[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return start;
	}
	}


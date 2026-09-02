package day3;

import java.util.Arrays;

public class _12_배열 {
	public static void main(String[] args) {
		
//		int arr[] = {};
//		int arr2[] = new int[3];
//		int arr3[] = {1,2,3,4,5};
		
		
//		int arr[] = new int[5];
//		arr[0] = 10;
//		arr[1] = 15;
//		arr[2] = 3;
//		arr[3] = 8;
//		arr[4] = 12;
		
//		System.out.println(Arrays.toString(arr));
		
		int arr2[] = {10, 15, 3, 8, 12};
		int total = 0;
		for(int i=0; i<arr2.length; i++) {
			total += arr2[i];
		}
		
		System.out.println("모든 수의 합은 " + total);
		
	}
}

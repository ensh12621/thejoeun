package day16;

import java.util.Arrays;

public class 예시문제 {

	public static void negativeArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = -arr[i];
		}
	} 
	
	public static void main(String[] args) {
		
		int[] arr = {3,5,2,4,1};
		// 배열을 내림차순 정렬
		
		Arrays.sort(arr);
		
//		for(int i=0; i<arr.length ; i++) {
//			System.out.println(arr[i]);
//		}
		
		negativeArr(arr);
		Arrays.sort(arr);
		negativeArr(arr);
		System.out.println(Arrays.toString(arr));
		
//		for(int i=arr.length-1; i>=0; i--) {
//			System.out.println(arr[i]);
//		}
		
		
//		for(int i = 0; i<arr.length; i++) {
//			for(int j =0; j<arr.length - 1 - i; j++) {
//				if(arr[j] < arr[j+1]) {
//					int tmp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = tmp;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));
		
		int[] arr3 = {3,5,2,4,1};
		Arrays.sort(arr3);
		
		System.out.println(arr3[arr3.length-1]);
		System.out.println(arr3[0]);
	}
}

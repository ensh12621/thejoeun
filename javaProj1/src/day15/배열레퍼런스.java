package day15;

import java.util.Arrays;

public class 배열레퍼런스 {

	static void plusArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]++;
		}
	}
	

//	static int[] plusArr(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]++;
//		}
//		return arr;
//	}
	
	public static void main(String[] args) {
		
		int[] arr = {3,5,2,4,1};
//		int[] newArr = plusArr(arr);
		plusArr(arr);
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(newArr));
		System.out.println(Arrays.toString(arr));
		
	}
}

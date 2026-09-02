package day3;

import java.util.Arrays;

public class _17_배열 {

	public static void main(String[] args) {
		
		int arr[] = { 3, 5, 1, 7, 4 };
		
		
		int tmp = arr[0];
		arr[0] = arr[3];
		arr[3] = tmp;
		
		System.out.println(Arrays.toString(arr));
				
		
	}
}

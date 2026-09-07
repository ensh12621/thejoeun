package day6;

import java.util.Arrays;

public class _4_Static {
	public static void main(String[] args) {
		int[] arr = {3,5,2,4,1};

		ArrayFunc.arrayMax(arr);
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
}

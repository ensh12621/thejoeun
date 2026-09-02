package day3;

import java.util.Arrays;
import java.util.Random;

public class _14_배열 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		
		Random random = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt(10) + 1;
		}

		System.out.println(Arrays.toString(arr));
		
	}
}

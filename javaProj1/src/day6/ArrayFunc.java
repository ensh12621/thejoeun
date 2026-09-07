package day6;

import java.util.Arrays;
import java.util.Random;

public class ArrayFunc {

	public static void arrayMax(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("배열에서 가장 큰 값은 " + max + "입니다.");
	}

	public static int arraySum(int[] arr) {
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		return total;
	}

	public static int arrayChoice(int[] arr, int index) {
		return arr[index-1];
	}

	public static void arrayRandom(int length) {
		int[] arr = new int[length];
		
		Random random = new Random();
		
		for(int i=0; i<length; i++) {
			arr[i] = random.nextInt(30) + 1;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

	
}

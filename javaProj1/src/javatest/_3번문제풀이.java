package javatest;

import java.util.Arrays;
import java.util.Random;

public class _3번문제풀이 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(30) + 1;
		}
		System.out.println(Arrays.toString(arr));
	}
}

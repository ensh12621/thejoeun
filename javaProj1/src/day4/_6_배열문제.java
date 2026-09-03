package day4;

import java.util.Arrays;
import java.util.Random;

public class _6_배열문제 {
	public static void main(String[] args) {
		int arr[] = new int[6];

		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			int n = random.nextInt(45) + 1;
			arr[i] = n;

			for (int j = 0; j < i; j++) {
				System.out.println("중복 체크!");
				if (arr[j] == n) {
					System.out.println("중복 걸림! (" + n + ")");
					i--;
					break;
				}
			}
			System.out.println();
		}

		System.out.println(Arrays.toString(arr));
	}
}
         
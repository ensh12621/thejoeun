package day4;

import java.util.Arrays;
import java.util.Scanner;

public class _5_배열 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + (i + 1) + "] 숫자입력: ");
			int input = scanner.nextInt();
			
			for(int j=0; j<i; j++) {
				System.out.println("중복숫자 체크..");
				if(arr[j] == input) {
					System.out.println("중복숫자 존재함!");
					i--;
					break;
				}
			}
			arr[i] = input;

		}

		System.out.println(Arrays.toString(arr));
	}
}

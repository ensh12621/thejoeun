package day4;

import java.util.Arrays;
import java.util.Scanner;

public class _4_배열문제 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			
			while(true) {
				System.out.print("[" + (i + 1) + "] 숫자입력: ");
				int input = scanner.nextInt();
				if(input >= 1 && input <= 100) {
					arr[i] = input;		
					break;
				}
				System.err.println("값을 1부터 100까지의 숫자로 입력해주세요!");
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}

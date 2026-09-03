package day4;

import java.util.Arrays;
import java.util.Scanner;

public class _3_배열 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int [5];
		for(int i=0; i<arr.length; i++) {
			System.out.print("["+ (i+1) + "] 숫자입력: ");
			arr[i] = scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

package day7_test;

import java.util.Scanner;

public class TempQuiz3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("숫자 입력: " );
			arr[i] = scanner.nextInt();
			
		}
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
		
	}
}

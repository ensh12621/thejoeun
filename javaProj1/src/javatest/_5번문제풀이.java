package javatest;

import java.util.Arrays;
import java.util.Scanner;

public class _5번문제풀이 {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		Scanner scanner = new Scanner(System.in);
		
		boolean isOdd = true;
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 숫자 입력: ");
			int num = scanner.nextInt();
			
			
			if(isOdd == true && num % 2 != 0) {
				arr[i] = num;
			}else if(isOdd == false && num % 2 == 0) {
				arr[i] = num;
			}else {
				System.out.println("값을 다시 입력해주세요.");
				i--;
				continue;
			}
			
			arr[i] = num;
			isOdd = !isOdd;
		}
		
		
		System.out.print("배열 결과 출력: " + Arrays.toString(arr));
	}
}

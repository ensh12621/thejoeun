package day3;

import java.util.Scanner;

public class _1_조건문복습 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자 입력: ");
//		int num = scanner.nextInt();
//		if(num >= 100) {
//			System.out.println("큰 수");
//		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = scanner.nextInt();
		if(num >= 100) {
			System.out.println("큰 수");
		}else {
			System.out.println("작은 수");
		}
		
		
	}
}

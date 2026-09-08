package day7_test;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int num = scanner.nextInt();
		
		if(num <= 0 || num >= 11) {
			System.out.println("계산할 수 없습니다.");
		}else {
			System.out.println(num % 2 == 0 ? "짝수" : "홀수");
		}
	}
}

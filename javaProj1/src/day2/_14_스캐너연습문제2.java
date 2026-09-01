package day2;

import java.util.Scanner;

public class _14_스캐너연습문제2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("나이(숫자)를 입력해주세요:");
		int age = scanner.nextInt();

		if (age < 0 || age > 120) {
			System.out.println("나이를 다시 입력해주세요");
		} else {
			if (age <= 12 || age >= 60) {
				System.out.println("무료입니다");
			} else if (age >= 13 && age <= 59) {
				System.out.println("1000원입니다");
			}
		}

	}
}

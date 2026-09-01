package day2;

import java.util.Scanner;

public class _13_스캐너연습문제 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 수를 입력해주세요:");
		int num1 = scanner.nextInt();

		System.out.print("두 번째 수를 입력해주세요:");
		int num2 = scanner.nextInt();

		int total = num1 + num2;

		if (total >= 50) {
			System.out.println("큰 수");

		} else if (total >= 20 && total <= 49) {
			System.out.println("중간 수");
		} else {
			System.out.println("작은 수");
		}
	}

}

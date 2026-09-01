package day2;

import java.util.Scanner;

public class _18_반복문연습문제2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		int total = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				total += i;
			}

		}
		System.out.println("1부터 100까지 숫자 중 3의 배수의 합 출력: " + total);

		System.out.print("숫자 입력: ");
		int target = scanner.nextInt();
		int total2 = 0;
		for (int i = 1; i <= target; i++) {
			total2 += i;
		}
		System.out.println("1부터 " + target + " 까지의 합:" + total2);

	}
}

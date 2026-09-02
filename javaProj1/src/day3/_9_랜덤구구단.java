package day3;

import java.util.Random;
import java.util.Scanner;

public class _9_랜덤구구단 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("랜덤 구구단 프로그램을 실행합니다.");
		System.out.println("정답에 0을 입력하면 종료됩니다.");

		int cnt = 0;
		int hit = 0;
		for (;;) {
			int x = random.nextInt(8) + 2;
			int y = random.nextInt(9) + 1;

			System.out.print(x + " x " + y + " = ");
			int answer = scanner.nextInt();

			if (x * y == answer) {
				System.out.println("정답");
				hit++;
			} else if (answer == 0) {
				System.out.println("종료되었습니다.");
				System.out.println(cnt + "횟수 중에 " + hit + "번 정답을 맞추셨습니다.");
				break;
			} else {
				System.out.println("오답");
			}

			cnt++;

		}
	}
}

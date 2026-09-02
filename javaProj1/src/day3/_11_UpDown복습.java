package day3;

import java.util.Random;
import java.util.Scanner;

public class _11_UpDown복습 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Up&Down 게임을 시작합니다");

		int result = random.nextInt(100) + 1;
		int cnt = 1;

		for (;;) {
			System.out.print("[" + cnt + "회]업&다운: ");
			int input = scanner.nextInt();

			if (!(input >= 1 && input <= 100)) {
				System.out.println("1부터 100까지의 숫자만 입력해주세요.");
				continue;
			}else if(input < result) {
				System.out.println("업");
			} else if (input > result) {
				System.out.println("다운");
			} else {
				System.out.println(cnt + "횟수 시도 만에 정답입니다! 답은 " + result + "입니다.");
				break;
			}

			cnt++;
		}

	}
}

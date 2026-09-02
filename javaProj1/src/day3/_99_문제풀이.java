package day3;

import java.util.Random;
import java.util.Scanner;

public class _99_문제풀이 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("=== 랜덤 구구단 ===");

		for (;;) {
			System.out.print("[ (1)구구단 시작 (2) 종료] : ");
			int command = scanner.nextInt();

			if (command == 1) {
				int correctCnt = 0;

				System.out.print("문제 수를 입력해주세요 : ");
				int calcCount = scanner.nextInt();
				int gameCount = 0;

				for (int i = 0; i < calcCount; i++) {

					gameCount++;
					int x = random.nextInt(8) + 2;
					int y = random.nextInt(9) + 1;

					int result = x * y;

					System.out.print("[" + gameCount + "번 문제] " + x + " * " + y + " = ");
					int userAnswer = scanner.nextInt();

					if (result == userAnswer) {
						System.out.println("정답!!!");
						correctCnt++;
					} else {
						System.out.println("오답!!!");
					}
					
					
				}
				
				System.out.println("" + correctCnt + "문제 맞추셨고 " + (gameCount - correctCnt) + "개 틀리셨습니다.");
			} else {
				System.out.println("종료되었습니다.");
				break;
			}

		}
	}
}

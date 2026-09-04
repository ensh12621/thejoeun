package middleTest;

import java.util.Random;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		while (true) {
			System.out.print("[1.구구단 풀기, 2. 종료]: ");
			int command = scanner.nextInt();

			if (command == 2) {
				System.out.println("종료되었습니다.");
				break;
			} else if (command == 1) {
				System.out.print("[1. 쉬움(2~5단), 2. 보통(6~9단), 3. 어려움(12~19단)]: ");
				int difficulty = scanner.nextInt();
				int answerHit = 0;

				for (int i = 0; i < 5; i++) {

					int num1 = 0, num2 = 0, result = 0;

					if (difficulty == 1) {
						num1 = random.nextInt(2,5)+1;
						num2 = random.nextInt(9) + 1;
						result = num1 * num2;
					} else if (difficulty == 2) {
						num1 = random.nextInt(6,9)+1;
						num2 = random.nextInt(9) + 1;
						result = num1 * num2;

					} else if (difficulty == 3) {
						num1 = random.nextInt(12,19)+1;
						num2 = random.nextInt(9) + 1;
						result = num1 * num2;
					}

					System.out.print("[" + (i + 1) + "번 문제]" + num1 + " x " + num2 + " = ");
					int userAnswer = scanner.nextInt();
					if (result == userAnswer) {
						answerHit++;
						System.out.println("정답입니다!");
					} else {
						System.out.println("틀렸습니다! 정답은 " + result + "입니다.");
					}
				}
				
				System.out.println("총 "+ answerHit + "개 맞추셨습니다");

			}

		}
	}
}

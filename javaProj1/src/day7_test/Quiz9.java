package day7_test;

import java.util.Random;
import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		while (true) {
			System.out.print("[1.홀짝 게임 시작, 2.종료] : ");
			int command = scanner.nextInt();

			if (command == 2) {
				break;
			} else {

				int answerHit = 0;
				for (int i = 0; i < 5; i++) {
					int target = random.nextInt(100) + 1;
					boolean isEven = target % 2 == 0; // 짝수:even 홀수:odd
					System.out.print("[" + (i + 1) + "라운드] 컴퓨터가 숫자를 뽑았습니다! [1. 홀수 2. 짝수] : ");
					int userAnswer = scanner.nextInt();

					if (	
						(userAnswer == 1 && !isEven) 
						||
						(userAnswer == 2 && isEven)
						) {
						// 유저가 홀수(1)을 선택했고 !isEven = 홀수인 경우 / 정답인 경우
						System.out.println("정답입니다! (컴퓨터가 뽑은 숫자 : " + target + ")");
						answerHit++;
					} else {
						System.out.println("틀렸습니다. (컴퓨터가 뽑은 숫자 : " + target + ")");
					}

				}
				System.out.println("총 5문제 중 " + answerHit + "개 맞췄습니다.");
			}

		}

		System.out.println("종료되었습니다.");
	}

}

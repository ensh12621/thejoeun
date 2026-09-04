package middleTest;

import java.util.Random;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int ranNum = random.nextInt(100) + 1;

		System.out.print("숫자 입력: ");
		int inputNum = scanner.nextInt();

		if (ranNum < inputNum) {
			System.out.println("입력한 수가 더 큽니다. 입력수(" + inputNum + ") 랜덤수(" + ranNum + ")");
		} else if (ranNum > inputNum) {
			System.out.println("랜덤 숫자가 더 큽니다.입력수("+inputNum+") 랜덤수("+ranNum+")");
		} else {
			System.out.println("두 수가 같습니다.");
		}
	}
}

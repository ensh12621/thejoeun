package day2;

import java.util.Scanner;

public class _11_스캐너 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자를 입력해주세요:");
		String inputText = scanner.next();

		System.out.println("입력한 텍스트: " + inputText);

		System.out.print("숫자를 입력해주세요:");
		int inputNum = scanner.nextInt();
		System.out.println("입력한 텍스트: " + inputNum);
	}

}

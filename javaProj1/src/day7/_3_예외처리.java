package day7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _3_예외처리 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("나누기를 할 3숫자를 입력해주세요: ");
			int num = scanner.nextInt();
			System.out.println("100을 " + num + "으로 나누면 " + (100 / num));
		} catch (Exception e) {
			System.out.println("얘기치 못한 오류가 발생했습니다.");
		} 
	}
}

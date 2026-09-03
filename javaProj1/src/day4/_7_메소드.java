package day4;

import java.util.Random;

public class _7_메소드 {

	static void firstMethod() {
		System.out.println("내가 만든 메소드 호출");
	}

	static int returnMethod() {
		int number = 10;
		return number;
	}

	static int sum(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		firstMethod();
//		Random random = new Random();
//		int randomNum = random.nextInt(10);
//		System.out.println(randomNum);

		int num = returnMethod();

		int result1 = sum(3, 5);
		int result2 = sum(10, 5);
		
	}
}

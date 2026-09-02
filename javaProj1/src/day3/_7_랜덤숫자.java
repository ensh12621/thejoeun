package day3;

import java.util.Random;

public class _7_랜덤숫자 {

	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt(10);
		System.out.println(x);
		int y = random.nextInt(6) + 1;
		System.out.println(y);
		
	}
}

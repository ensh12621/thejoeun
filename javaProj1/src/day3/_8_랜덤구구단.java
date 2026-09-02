package day3;

import java.util.Random;
import java.util.Scanner;

public class _8_랜덤구구단 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int x = random.nextInt(8) + 2;
		int y = random.nextInt(9) + 1;
		
		System.out.print(x + " x " + y + " = ");
		int answer = scanner.nextInt();
		
		if(x * y == answer) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
		
		
	}
}

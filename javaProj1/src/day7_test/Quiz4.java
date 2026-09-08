package day7_test;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자입력(1~50): ");
			int num = scanner.nextInt();
			if(num >= 1 && num <= 50) {
				break;
			}
		}
		
		
	}
}

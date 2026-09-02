package day3;

import java.util.Scanner;

public class _2_조건문복습 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if(age <= 19) {
			System.out.println("1000원");
		}else if(age >= 20 && age <= 65) {
			System.out.println("3000원");
		}else {
			System.out.println("무료");
		}
	}
}

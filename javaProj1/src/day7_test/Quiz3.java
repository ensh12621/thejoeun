package day7_test;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자입력(2~9): ");
		int num = scanner.nextInt();
		
		if(!(num >= 2 && num <= 9)) {
			System.out.println("잘못 입력된 숫자 입니다");
		}else {
			for(int i=1; i<=9; i++) {
				System.out.println(num + " x " + i + " = " + (num*i));
			}
		}
		
	}
}

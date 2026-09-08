package day7_test;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int lang, english, math;
		
		System.out.print("국어: " );
		lang = scanner.nextInt();
		System.out.print("영어: " );
		english = scanner.nextInt();
		System.out.print("수학: " );
		math = scanner.nextInt();
		
		if(lang < 50 || english < 50 || math < 50) {
			System.out.println("과락으로 인한 불합격");
		}else {
			int avg = (lang + english + math) / 3;
			
			if(avg >= 80) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}
		
	}
}

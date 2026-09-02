package day2;

import java.util.Scanner;

public class _21_중첩반복연습문제 {

	public static void main(String[] args) {
		
		for(int i=9; i>=2; i--) {
			for(int j=9; j>=1; j--) {
				System.out.println(i + " x " + j + " = " + (i *j));
			}
			System.out.println();
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("별 갯수: ");
		int starNum = scanner.nextInt();
		for(int i=0; i<starNum; i++) {
			for(int j=i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

package middleTest;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("숫자입력1: " );
		num1 = scanner.nextInt();
		
		System.out.print("숫자입력2: ");
		num2 = scanner.nextInt();
		
		if(num1 + num2 > 10) {
			System.out.println("큰 수");
		}else {
			System.out.println("작은 수");
		}
		
	}
}

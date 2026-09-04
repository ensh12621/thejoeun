package middleTest;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력: ");
			int num = scanner.nextInt();
			if(!(num >= 1 && num <=30)) {
				System.out.println("숫자가 1부터 30 사이의 입력값이어야 합니다.");
			}else {
				if(num % 2 == 0) {
					System.out.println("짝수");
					
				}else {
					System.out.println("홀수");
				}
				break;
			}
		}
	}
}

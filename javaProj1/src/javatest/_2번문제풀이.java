package javatest;

import java.util.Scanner;

public class _2번문제풀이 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자입력:" );
		try{
			int num = scanner.nextInt();
			String isOddOrEven= num % 2 == 0 ? "짝수" : "홀수";
			System.out.println("입력하신 숫자는 "+isOddOrEven+"입니다.");
		}catch(Exception e) {
			System.out.println("올바른 숫자를 입력해주세요.");
		}
		
	} 
	
}

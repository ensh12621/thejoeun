package day8;

import java.util.Scanner;

public class _7_서브스트링 {
	public static void main(String[] args) {
//		String text = "Hello JAVA";
//		System.out.println(text.substring(1));
//		System.out.println(text.substring(2, 7));

//		String text = "Hello";
//		// 첫 글자 맨 뒤로
//		//System.out.println(text.substring(0, 1));
//		String result = text.substring(1) + text.substring(0, 1);
//		System.out.println(result.toUpperCase());

		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String input = scanner.next();
		for (int i = 0; i < input.length(); i++) {
			input = input.substring(1, input.length()) + input.substring(0, 1);
			System.out.println(input);
		}

	}
}

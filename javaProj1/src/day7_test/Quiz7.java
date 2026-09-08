package day7_test;

import java.util.Scanner;

public class Quiz7 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("숫자 입력: ");
			arr[i] = scanner.nextInt();
		}

		System.out.print("검색할 숫자: ");
		String searchNum = String.valueOf(scanner.nextInt());

		int idx = -1;
		for (int i = 0; i < arr.length; i++) {
			if (String.valueOf(arr[i]).equals(searchNum)) {
				idx = i;
			}
		}

		if (idx == -1) {
			System.out.println("배열에 없는 숫자입니다.");
		} else {
			System.out.println("해당 숫자는 배열의 " + idx + "번째에 있습니다.");
		}

	}
}

package day3;

import java.util.Scanner;

public class _5_무한루프 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		int x = 1;
//		for(;;) {
//			if(x % 3 == 0 && x % 7 == 0) {
//				System.out.println(x);
//				break;
//			}
//			x++;
//		}

		for (;;) {
			System.out.print("점수 입력: ");
			int score = scanner.nextInt();
			
			if (score >= 90 && score <= 100) {
				System.out.println("A학점");
				
			} else if (score >= 80 && score < 90) {
				System.out.println("B학점");
			} else if (score >= 70 && score < 80) {
				System.out.println("C학점");
			} else if (score >= 60 && score < 70) {
				System.out.println("D학점");
			} else if (score > 100) {
				System.out.println("다시 입력하세요");
				continue;
			} else {
				System.out.println("F학점, 공부하세요");
			}
			
			break;
		}

	}
}

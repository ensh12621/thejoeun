package day3;

import java.util.Random;
import java.util.Scanner;

public class _10_Up_Down {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int randomNumber = random.nextInt(100) + 1;
		int gameCnt = 1;
		
		
		for(;;) {
			System.out.print("[" + gameCnt + "회 시도]업&다운: ");
			int input = scanner.nextInt();
			
			if(!(input >= 1 && input <= 100)) {
				System.out.println("1부터 100까지의 숫자로 입력해주세요");
				continue;
			}
			if(randomNumber > input) {
				System.out.println("업!"); 
				
			}else if(randomNumber < input) {
				System.out.println("다운!");
			}else {
				System.out.println("(" + gameCnt + ") 횟수 만에 드디어 정답! 숫자는 " + randomNumber + "!");
				break;
			}
			
			gameCnt++;
			
		}
	}
}

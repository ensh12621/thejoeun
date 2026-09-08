package day7_test;

import java.util.Random;

public class TempQuiz4 {

	public static void main(String[] args) {

		Random random = new Random();

		int cpuTotal = 0;
		int userTotal = 0;
		
		for(int i=0; i<3; i++) {
			cpuTotal += random.nextInt(6) + 1;
			userTotal += random.nextInt(6) + 1;
		}

		System.out.println("컴퓨터 총합: " + cpuTotal + "점, 사용자 총합: " + userTotal + "점");
		if (cpuTotal > userTotal) {
			System.out.println("컴퓨터 승리");
		} else if (cpuTotal < userTotal) {
			System.out.println("사용자 승리");
		} else {
			System.out.println("무승부");
		}
	}

}

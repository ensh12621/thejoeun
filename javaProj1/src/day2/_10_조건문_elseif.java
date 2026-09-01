package day2;

public class _10_조건문_elseif {

	public static void main(String[] args) {

		int score = 105;
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
		} else {
			System.out.println("F학점, 공부하세요");
		}

	}
}

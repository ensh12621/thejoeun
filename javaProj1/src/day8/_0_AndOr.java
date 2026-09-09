package day8;

public class _0_AndOr {

	static boolean test(int x) {
		System.out.println("원하는 메시지");
		return x > 30;
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		if(a > 10 && test(b)) {
			System.out.println("두 수 모두 큰 수입니다.");
		}
		
		if(a > 100 & test(b)) {
			System.out.println("두 수 모두 큰 수입니다.");
		}
	}
}


package day2;

public class _3_논리연산자 {

	public static void main(String[] args) {
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		int age = 5;
		double height = 99.9;
		System.out.println(age <= 6 && height <= 100);
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(age <= 6 || age >= 60);
		
	}
}

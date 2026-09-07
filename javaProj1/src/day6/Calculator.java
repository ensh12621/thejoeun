package day6;

public class Calculator {

	public static int sum(int x, int y) {
		return x + y;
	}

	public static int sum(int x, int y, int z) {
		return x + y + z;
	}

	public static double sum(double x, double y) {
		return x + y;
	}

	public static void multiple(int x, int y) {
		System.out.println("두 수의 곱은 " + (x * y) + "입니다");
	}

	public static void arraySum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println("배열의 모든 수의 합은 " + sum + " 입니다");
	}

}

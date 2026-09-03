package day4;

public class _10_오버로딩 {

	public static int sum(int x, int y) {
		return x + y;
	}
	
	public static double sum(int x, double y) {
		return x+y;
	}

	public static int sum(int x, int y, int z) {
		return sum(x,y)+z;
	}
	
	public static void main(String[] args) {
		int result = sum(3, 5);
		int result2 = sum(1,2,3);
		double result3 = sum(10, 20.5);
	}
}

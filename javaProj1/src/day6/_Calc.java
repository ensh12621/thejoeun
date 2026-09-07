package day6;

public abstract class _Calc {
	abstract int sum(int x, int y);
	abstract int sum(int x, int y, int z);
	abstract int multiple(int x, int y);
	abstract double divide(int x, int y);
	
	
	void info() {
		System.out.println("아주 좋은 계산기입니다.");
	}
}

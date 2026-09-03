package day4;

public class _8_객체생성 {
	public static void main(String[] args) {
		Human hong = new Human();
		Human kim = new Human();
		Human park = new Human();
	
		hong.name = "홍길동";
		kim.name = "김철수";
		System.out.println(hong.name);
		System.out.println(kim.name);
		
		hong.eat();
		kim.eat();
	
		hong.walk(1.0);
	}
}

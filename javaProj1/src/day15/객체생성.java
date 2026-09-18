package day15;

public class 객체생성 {

	public static void main(String[] args) {
		Human hong = new Human("홍길동", 30);
		hong.walk();
		
		System.out.println(hong.eat("라면"));
		
		
		Human h = new Human();
		
	}
}

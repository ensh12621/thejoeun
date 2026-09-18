package day15;

public class Private변수 {

	public static void main(String[] args) {
		Human hong = new Human("홍길동", 30);
		
		hong.setAge(-10);
		System.out.println(hong.getAge());

		Human.intro();
		hong.intro = "zzzzzzzzzzzzzz";
		
		System.out.println(Human.intro);
		
		int max = Math.max(10, 20);
		
	}
}

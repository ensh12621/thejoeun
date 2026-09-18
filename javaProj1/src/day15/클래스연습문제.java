package day15;

public class 클래스연습문제 {

	public static void main(String[] args) {
		Food f1 = new Food();
		Food f2 = new Food("라면", 1000);
		Food f3 = new Food("김밥", 1000, 10);
		
//		System.out.println(f1.name);
		
		System.out.println(f1.getName());
		System.out.println(f1.getPrice());
		
		System.out.println(f2.getName());
		System.out.println(f3.getCount()); // 10 출력
		
		System.out.println(Food.marketName); // 코딩천국 출력
	}
}

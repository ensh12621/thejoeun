package day5;

public class _2_클래스연습문제 {

	public static void main(String[] args) {
		Food food1 = new Food("라면", 1000);
		Food food2 = new Food("김밥", 2000);
		
		food1.info(); // 출력: 라면은 1000원입니다
		food2.setPrice(2500);
		food2.info(); // 출력: 김밥은 2500원입니다.
		
		int price = food1.getPrice();
		System.out.println(price);
	} 
	
}

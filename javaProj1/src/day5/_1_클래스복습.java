package day5;

public class _1_클래스복습 {

	public static void main(String[] args) {
		Car car = new Car("소나타", "검은색", 1000);
		Car car2 = new Car("모닝", "노란색", 500);
		Car car3 = new Car("티코", "빨간색");
		
//		System.out.println(car.carInfo());
//		System.out.println(car2.carInfo());
//		car.speedUp(100);
//		car.speedDown(30);
//		car.speedDown();
		
		int price = car.getPrice();
		System.out.println(price);
		car.setPrice(-100);
		car.setPrice(1500);
		price = car.getPrice();
		System.out.println(price);
		
		
	}
}

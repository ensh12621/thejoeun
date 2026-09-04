package day5;

public class _5_Private지정자 {
	public static void main(String[] args) {
		Fruit apple = new Fruit("사과", 100, 3000);
//		apple.price = 1000;
//		apple.count = 5000;
		System.out.println("변경 전: " + apple.getPrice());
		apple.setPrice(-100);
		System.out.println("변경 후: " + apple.getPrice());
		
	}
}

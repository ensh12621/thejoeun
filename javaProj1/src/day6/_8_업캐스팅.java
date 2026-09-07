package day6;

public class _8_업캐스팅 {
	
	static void fruitBoxing(Fruit fruit) {
		System.out.println(fruit.name + "를 포장했습니다.");
	}
	static void appleBoxing(Apple a) {
		System.out.println(a.name + "를 포장했습니다.");
	}
	static void bananaBoxing(Banana b) {
		System.out.println(b.name + "를 포장했습니다.");
	}
	static void orangeBoxing(Orange o) {
		System.out.println(o.name + "를 포장했습니다.");
	}
	
	
	
	public static void main(String[] args) {
		Fruit fruit1 = new Fruit("과일");
		Apple apple1 = new Apple("사과");
		Orange orange1 = new Orange("오렌지");
		Banana banana1 = new Banana("바나나");
		
		fruit1 = apple1;
		fruit1 = orange1;
		fruit1 = banana1;
		
		Fruit fruit2 = orange1;
		
		appleBoxing(apple1);
		
		fruitBoxing(apple1);
		fruitBoxing(orange1);
		fruitBoxing(banana1);
	}
}


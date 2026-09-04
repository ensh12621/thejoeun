package day5;

public class Food {

	private String name;
	private int price;
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// 출력: 라면은 1000원입니다
	public void info() {
		System.out.println(name + "은 " + price + "원입니다.");
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

}

package day5;

public class Fruit {
	private String name;
	private int price;
	private int count;
	
	

	Fruit(String name, int count, int price){
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public void setPrice(int price) {
		if(price <= 0) {
			System.out.println("값을 다시 확인해주세요");
			return;
		}
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}

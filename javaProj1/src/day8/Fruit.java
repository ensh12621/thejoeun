package day8;

public class Fruit {
	private String name;
	private int price;

	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Fruit) {
			Fruit comparedFruit = (Fruit) obj;
			return this.name.equals(comparedFruit.getName()) 
					&& 
					this.price == comparedFruit.getPrice();
		}
		
		return false;
	}
}

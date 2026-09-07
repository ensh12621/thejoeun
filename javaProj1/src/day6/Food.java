package day6;

public class Food {

	private String name;
	private int price;
	private String kind;
	
	public Food() {}
	
	public Food(String name, int price) {
//		this.name = name;
//		this.price = price;
//		this.kind = "미정";
		this(name, price, "미정");
	}
	
	public Food(String name, int price, String kind) {
		this.name = name;
		this.price = price;
		this.kind = kind;
	}
	
	public String getInfo() {
		
		if(name == null || price == 0 || kind == null) {
			return "정보가 없습니다.";
		}
		
		String info = "음식이름: " + name;
		info += ", 가격: " + price;
		info += ", 종류: " + kind;
		return info;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price <= 0) {
			System.out.println("가격은 1원 이상 입력해주세요.");
			return;
		}
		this.price = price;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
}

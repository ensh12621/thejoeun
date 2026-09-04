package day5;

public class Car {

	String modelName;
	String color;
	private int price;
	int speed;
	
	
	public Car(String modelName, String color) {
		this.modelName = modelName;
		this.color = color;
	}
	
	public Car(String modelName, String color, int price) {
		this.modelName = modelName;
		this.color = color;
		this.price = price;
	}
	
	public void speedUp(int speed) {
		this.speed += speed;
		System.out.println("현재 속도는 " + this.speed + " 입니다.");
	}
	

	public void speedDown() {
		this.speed = 0;
		System.out.println("자동차가 정지했습니다.");
	}
	
	
	public void speedDown(int speed) {
		this.speed -= speed;
		System.out.println("현재 속도는 " + this.speed + " 입니다.");
	}
	
	public String carInfo() {
		String info = "모델명: " + this.modelName 
						+ ", 색상: " + this.color;
		return info;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		// 가격은 1이상 입력해주세요
		if(price <= 0) {
			System.out.println("가격은 1이상 입력해주세요");
			return;
		}
		this.price = price; 
	}
	
	

}


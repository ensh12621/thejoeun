package day15;

public class Person {

	private String name;
	private int age;
	private String addr;
	
	public Person(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public void speak() {
		System.out.println(name + "가(이) 말한다.");
	}
	
	public void eat() {
		System.out.println("음식 먹는 중");
	}

	public String getInfo() {
		return name+"의 나이는 "+age+"살 입니다.";
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
}

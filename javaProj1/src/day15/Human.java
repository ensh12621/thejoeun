package day15;

import java.util.Objects;

public class Human {

	private String name;
	private int age;
	private String gender;
	String addr;
	
	static String intro = "Human 클래스 멤버입니다.";
	
	static void intro() {
		System.out.println("Human 클래스 멤버(메소드)입니다.");
		
	}
	
	public Human(String name, int age) {
		this(name, age, "알수없음");
	}
	
	public Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Human() {
		
	}

	public void walk() {
		System.out.println(name + "가(이) 걷는다");
	}
	
	public String eat(String food) {
		return food + "를(을) 먹는다";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0) {
			System.out.println("나이는 0이상 입력해주세요");
			return;
		}
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	@Override
	public String toString() {
		return name;
	}
	
	
}

package day5;

public class Animal {

	String kind;
	String name;
	int age;
	
	public Animal() {
		
	}
	
	public Animal(String kind, int age) {
		this(kind, "이름미정",  age);
	}
	
	public Animal(String kind, String name, int age) {
		this.kind = kind;
		this.name = name;
		this.age = age;
	}
	
}

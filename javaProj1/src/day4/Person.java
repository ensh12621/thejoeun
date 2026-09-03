package day4;

public class Person {

	String name;
	int age;
	String addr;
	double height;
	
	public Person(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public Person(String name, int age, String addr, double height) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.height = height;
	}
}

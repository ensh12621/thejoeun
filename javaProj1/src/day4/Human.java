package day4;

public class Human {

	String name;
	int age;
	String addr;
	double height;
	
	public void eat() {
		System.out.println(name+"가(이) 밥을 먹는다");
	} 
	
	public void sleep() {
		System.err.println("잠을 잔다");
	}
	
	public void walk(double distanceKillometers) {
		System.out.println(distanceKillometers + "km을 걷는다");
	}
}

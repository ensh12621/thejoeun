package day6;

public class Tj_student {

	String name;
	int stdNo;
	int money;
	static int classMoney = 500000;
	
	public Tj_student(String name, int stdNo, int money) {
		this.name = name;
		this.stdNo = stdNo;
		this.money = money;
	}
	
	void classMoneytInfo() {
		System.out.println("남은 회비: " + classMoney);
	}
	
//	static void moneyInfo() {
//		System.out.println("남은 금액: " + money);
//	}
	 
}

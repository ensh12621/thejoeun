package day6;

public class Student extends Human{
	int studentNo;

	
	
	public Student(int studentNo) {
		this.studentNo = studentNo;
	}
	
	
	
	public Student(String name, int age, String addr, int studentNo) {
		// TODO Auto-generated constructor stub
		super(name, age, addr);
		this.studentNo = studentNo;
	}

	void study() {
		System.out.println("공부한다.");
	}

}

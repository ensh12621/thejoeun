package day15;

public class Student extends Person {

	private String stuNo;

	public Student(String name, int age, String addr, String stuNo) {
		super(name, age, addr);
		this.stuNo = stuNo;
	}

	public void study() {
		System.out.println("공부한다.");
	}

	@Override
	public String getInfo() {
		return super.getInfo() + 
				"\n주소는 " + super.getAddr() + "," +
				" 학번은 " + stuNo + " 입니다.";
	}

}

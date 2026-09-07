package day6;

public class _3_Static {
	public static void main(String[] args) {
		Tj_student hong = new Tj_student("홍길동", 1234, 50000);	
		Tj_student kim = new Tj_student("김철수", 9876, 300000);
		
		kim.money -= 30000;
		System.out.println(hong.money);
		
		Tj_student.classMoney -= 100000;
		System.out.println(Tj_student.classMoney);
		
		Tj_student.classMoney += 50000;
		System.out.println(Tj_student.classMoney);
		
		kim.classMoneytInfo();
	}
	
	
	
	
	
}

package day15;

public class 객체레퍼런스 {

	public static void main(String[] args) {
		int a= 10;
		int b = a;
		a= 15;
		System.out.println(b);
		
		Human h1 = new Human("hong", 30);
		Human h2 = new Human("hong", 30);

		System.out.println(h1 == h2);
		
		h1.addr = "인천";
		System.out.println(h2.addr);
		
		Human h3 = h2;
		h2.addr = "서울";
		System.out.println(h3.addr);
	}
}

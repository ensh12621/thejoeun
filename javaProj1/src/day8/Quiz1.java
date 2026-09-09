package day8;

public class Quiz1 {

	public static void main(String[] args) {
			ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
			cp.setXY(10, 20);
			cp.setColor("RED");
			String str = cp.toString();
			System.out.println(str + "입니다. ");
			//결과 : RED색의 (10,20)의 점입니다.
	}
}

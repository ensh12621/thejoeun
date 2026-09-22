package day17;

public class 문자열클래스 {

	public static void main(String[] args) {
		String text = "abcdefghc";
		
		String result1 = text.substring(3);
		System.out.println(result1);
		
		String result2 = text.substring(3, 6);
		System.out.println(result2);
		
		int result3 = text.indexOf("c");
		System.out.println(result3);
		
		int result4 = text.lastIndexOf("c");
		System.out.println(result4);
		
		String result5 = text.charAt(3) + "";
		System.out.println(result5);
		
		String result6 = text.replace("c", "A");
		System.out.println(result6);
	}
	
}

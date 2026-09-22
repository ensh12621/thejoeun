package day17;

public class 연습문제1 {

	public static void main(String[] args) {
		String email = "goodjava@gmail.com";
		
		int idx = email.indexOf("@") + 1;
		
		String domain = email.substring(idx);
		System.out.println(domain);
		
		
		String phone = "010-1234-5678";
		String resolvedPhone = phone.replace("-", "");
		System.out.println(resolvedPhone);
	}
	
}

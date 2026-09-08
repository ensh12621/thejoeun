package day7_test;

public class TempQuiz1 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i=1; i<=100; i++) {
			if(i % 5 == 0 && i % 8 != 0) {
				System.out.println(i);
				cnt++;
			}
			
		}
		
		System.out.println("총 갯수: " + cnt);
	} 
	
}

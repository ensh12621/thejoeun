package day3;

public class _4_반복문키워드 {

	public static void main(String[] args) {
//		for(int i=1; i<=1000; i++) {
//			if(i % 3 == 0 && i % 7 == 0) {
//				System.out.println(i);
//				break;
//			}

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}

package day17;

public class 연습문제6 {

	public static void main(String[] args) {
		int[][] arr = new int[7][7];
		// 포기..

		int level = 0;
		for(int i=1; i<=arr.length; i++) {
			int num = 1;
			for(int j=1; j<=arr.length; j++) {

				if(level == 1) {
					num = i*num;
				}
				System.out.print(num);
				
			}
			level++;
			System.out.println();
		}
		
	}
}

package day3;

public class _13_반복문_while {
	public static void main(String[] args) {
		
//		int i = 1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
//		
		int i=2;
		while(i<=9) {
			
			int j = 1;
			while(j<=9) {
				System.out.println(i + " x " + j + " = " + (i*j));
				j++;
			}
			System.out.println();
			i++;
		}
	}    
}

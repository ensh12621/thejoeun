package day17;

import java.util.Arrays;

public class 연습문제5 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int iBase = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = (iBase+1) + (j*4);
				iBase++;
			}
			iBase = (i+1);
		}
		
		// 오.. 내가 이걸 어떻게 푼거지 ;;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}

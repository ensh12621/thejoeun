package day14;

import java.util.Arrays;

public class _2_2차원배열_문제 {

	public static void main(String[] args) {
		int[][] arr = new int[3][5];

		arr[1][3] = 99;

		System.out.println("행의 개수 => " + arr.length);
		System.out.println("열의 개수 => " + arr[0].length);

		System.out.println(Arrays.toString(arr));

		int idx = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = idx;
				idx++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		

	}
}

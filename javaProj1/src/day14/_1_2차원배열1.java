package day14;

import java.util.Arrays;

public class _1_2차원배열1 {

	public static void main(String[] args) {
		int[][] arr = new int[3][5];
		
		arr[1][3] = 99;
		
		System.out.println("행의 개수 => " + arr.length);
		System.out.println("열의 개수 => " + arr[0].length);
		
		System.out.println(Arrays.toString(arr));
		
		
		int arr2[][] = {
				{3,5,2}, 
				{2,5,9,8,1}, 
				{4,9,7,5,2}
		};
		
	}
}

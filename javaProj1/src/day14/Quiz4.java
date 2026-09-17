package day14;

import java.util.Arrays;
import java.util.Random;

public class Quiz4 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int arr[][] = new int[4][4];
		
		for(int i=1; i<=10; i++) {
			int x = random.nextInt(4);
			int y = random.nextInt(4);
			if(arr[x][y] != 0) {
				i--;
				continue;
			}
			arr[x][y] = i;
		}
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}

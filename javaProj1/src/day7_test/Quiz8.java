package day7_test;

import java.util.Arrays;
import java.util.Random;

public class Quiz8 {

	public static void main(String[] args) {

		Random random = new Random();
		int[] arr = new int[20];

		int[] cntArr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(5) + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			cntArr[num-1]++; // 0 베이스 인덱스이므로
		}

		System.out.println(Arrays.toString(arr));
		
		System.out.println("1: " + cntArr[0] 
								+ "번, " + "2: " 
								+ cntArr[1] + "번, " 
								+ "3: " + cntArr[2] + "번, " 
								+ "4: " + cntArr[3] + "번, " 
								+ "5: " + cntArr[4] + "번");
	}
}

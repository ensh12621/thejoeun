package day7_test;

import java.util.Random;

public class TempQuiz2 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Random random = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt(100) + 1;
		}
		
		int cnt = 0;
		for(int i : arr) {
			if(i % 2 == 1) {
				System.out.println(i);
				cnt++;
			}
		}
		System.out.println("마지막 홀수 갯수: " + cnt);
		
	}
}

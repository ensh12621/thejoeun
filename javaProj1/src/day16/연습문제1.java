package day16;

import java.util.Arrays;
import java.util.Random;

public class 연습문제1 {

	public static void main(String[] args) {

		Random random = new Random();

		int[] arr = { 3, 5, -9, -2, 8 };
		int sum = 0;
		for (int n : arr) {
			sum += n < 0 ? n * -1 : n;
		}
		System.out.println(sum);
		// 배열의 모든 숫자의 합 구하기
		// 음수는 양수로 바꿔서 계산

		int[] arr2 = new int[6];
		// 1~50 사이의 랜덤한 숫자 배열에 넣은 후
		// 두 번쨰로 큰 숫자 구하기
		// 중복 있어도 상관없음
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = random.nextInt(50) + 1;
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] *= -1;
		}
		
		Arrays.sort(arr2);
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] *= -1;
		}
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2[1]);

	}
}

package day3;

import java.util.Arrays;
import java.util.Random;

public class _18_배열문제 {
	public static void main(String[] args) {
		int arr[] = new int[6];

		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {

			while (true) {
				int n = random.nextInt(100) + 1;
				if (n % 2 == 1) {
					arr[i] = n;
					break;
				}
			}
		}

		System.out.println(Arrays.toString(arr));

		int avg = 0;

		for (int i = 0; i < arr.length; i++) {
			avg += arr[i];
		}

		avg /= arr.length;

		System.out.println("average: " + avg);

		// 가장 큰 숫자의 위치와 가장 작은 숫자의 위치를 바꾸기
		int minVal = arr[0];
		int minIdx = 0;
		int maxVal = arr[0];
		int maxIdx = 0;

		for (int i = 0; i < arr.length; i++) {
			if (minVal > arr[i]) {
				minVal = arr[i];
				minIdx = i;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (maxVal < arr[i]) {
				maxVal = arr[i];
				maxIdx = i;
			}
		}

		System.out.println("가장 작은 수:(" + minVal + ") (" + minIdx + ")번 째 인덱스");
		System.out.println("가장 큰 수 :(" + maxVal + ") (" + maxIdx + ")번째 인덱스");
		
		System.out.println("위치 바꾸기..");
		int tmpVal = arr[minIdx];
		arr[minIdx] = arr[maxIdx];
		arr[maxIdx] = tmpVal;
		
		System.out.println(Arrays.toString(arr));

	}
}

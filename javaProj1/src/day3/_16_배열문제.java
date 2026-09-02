package day3;

public class _16_배열문제 {
	public static void main(String[] args) {
		int arr[] = { 3, 5, 1, 7, 4 };

		// 배열 안에 있는 숫자 중에서 가장 작은 숫자의 위치를 알고 싶어요

		int minIdx = 0;
		int minVal = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (minVal > arr[i]) {
				minVal = arr[i];
				minIdx = i;
			}
		}

		System.out.println("가장 작은 수(" + minVal + ") 인덱스(" + minIdx + ")");

	}
}

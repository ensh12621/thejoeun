package day16;

import java.util.Arrays;

public class 연습문제3 {

	public static void main(String[] args) {
		int[] arr = { 3, 5, -1, -7, 6 };
		// 음수를 무시하고 오름차순
		//{-1, 3, 5, 6, -7}
		boolean[] flagIdx = new boolean[arr.length];
		
		
		for(int i=0; i<arr.length; i++) {
//			System.out.println("flagIdx["+i+"] = " + arr[i]);
			flagIdx[i] = arr[i] < 0;
//			System.out.println("flagIdx["+i+"] going to be " + flagIdx[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Math.abs(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					
					boolean tmpBool = flagIdx[j];
					flagIdx[j] = flagIdx[j+1];
					flagIdx[j+1] = tmpBool;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = flagIdx[i] == true ? -1 * arr[i] : arr[i]; 
		}
		
//		System.out.println(Arrays.toString(flagIdx));
		System.out.println(Arrays.toString(arr));
		
		
		int arr2[] = {3, 5, 2, 4, 6, 9, 8};
		// 홀수와 짝수들의 합의 차이 구하기
		// 차이는 무조건 양수로 나오도록
		int oddSum = 0;
		int evenSum = 0;
		for(int n : arr2) {
			if(n % 2 == 0) {
				evenSum += n;
			}else {
				oddSum += n;
			}
		}
		
		int result = oddSum > evenSum ? oddSum-evenSum : evenSum - oddSum;
		System.out.println(result);
	}
}

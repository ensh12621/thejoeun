package day16;

import java.util.Arrays;

public class 유용한함수 {

	public static void main(String[] args) {
		int[] arr = {3, -10, 4, 7, -8};
		// 배열 요소들을 양수로 바꾸고 오름차순 정렬 ㄱㄱ
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < 0) {
				arr[i] *= -1;
			}
		}
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length - 1 - i; j++) {
//				System.out.println(arr[j] + ", " + arr[j+1] + " changing..");
				if(arr[j] > arr[j+1]) {
//					System.out.println(arr[j] + ", " + arr[j+1] + " changing..now");
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
					
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

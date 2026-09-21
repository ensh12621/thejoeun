package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 연습문제4 {

	public static void main(String[] args) {

//		int[] arr = new int[5];
//		Scanner scanner = new Scanner(System.in);
//
//		// 배열에 입력 값 넣기
//		for (int i = 0; i < arr.length; i++) {
//
//			// 10 ~30 사이 값만 넣기
//			// 그외는 다시 입력
//			System.out.print("입력: ");
//			int num = scanner.nextInt();
//
//			if (!(num >= 10 && num <= 30)) {
//				i--;
//				System.out.println("값은 10~30까지 입력하기! ");
//				continue;
//			}
//			arr[i] = num;
//		}
//
//		System.out.println(Arrays.toString(arr));

		int arr2[] = { 3, 9, 6, 5, 4, 2, 15, 8 };
		// 홀수 먼저 정렬 -> 오름차순
		// 짝수 뒤에 정렬 -> 내림차순
		// 결과 : {3,5,9,15,8,6,4,2}
		// 결과는 배열로 출력. 새로운 배열 만들어도 됨
		
		List<Integer> oddList = new ArrayList<>();
		List<Integer> evenList = new ArrayList<>();
		
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i] % 2 == 0) {
				evenList.add(arr2[i]);
			}else {
				oddList.add(arr2[i]);
			}
		}
		
		
		Integer[] oddArr = oddList.toArray(new Integer[0]);
		Integer[] evenArr = evenList.toArray(new Integer[0]);
		
		for(int i=0; i<evenArr.length; i++) {
			evenArr[i] *= -1;
		}
		
		Arrays.sort(oddArr);
		Arrays.sort(evenArr);
		
		for(int i=0; i<evenArr.length; i++) {
			evenArr[i] *= -1;
		}
		
//		System.out.println(Arrays.toString(oddArr));
//		System.out.println(Arrays.toString(evenArr));
		
		List<Integer> totalList = new ArrayList<>();

		for(int n : oddArr) {
			totalList.add(n);
		}
		
		for(int n : evenArr) {
			totalList.add(n);
		}
		
		Integer[] resultArr = totalList.toArray(new Integer[0]);
		System.out.println(Arrays.toString(resultArr));
		
		
	}
}

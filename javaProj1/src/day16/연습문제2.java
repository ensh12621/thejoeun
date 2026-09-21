package day16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 연습문제2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int [5];
		// 스캐너를 통해 숫자 5개 입력받아 배열에 추가
		// 양수 입력 -> 음수로, 또는 반대로
		// 
		for(int i=0; i< arr.length; i++) {
			System.out.print("숫자입력: ");
			arr[i] = scanner.nextInt() * -1;
			
		}
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = {30, 20, 60, 15, 25, 20, 60, 15, 10, 30};
		// 중복없는 숫자 출력
		
		Set<Integer> set = new HashSet<>();
		for(int n : arr2) {
			set.add(n);
		}
		
		
		Integer[] arr2WithoutDuplication = set.toArray(new Integer[0]);
		System.out.println(Arrays.toString(arr2WithoutDuplication));
		
		
		
		
		
	}
}

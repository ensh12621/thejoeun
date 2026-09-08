package day7_test;

import java.util.Arrays;

public class Quiz10 {


	public static void main(String[] args) {
		int[] arr = {7, 4, 5, 1, 3};
		
		// 오름차순!!
		
		System.out.println("기본값 => " + Arrays.toString(arr));
		
		// 요소 5개일 때 최대 4회전이므로 arr.length - 1
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				// arr.length -1 => 4, 
				// 그리고 매 회전마다 1씩 줄어드니까 매번 증가하는 i를 loop 최대값에서 빼면 ~4, ~3, ~2, ~1이 됨
				
				//System.out.println("[j:"+j+"/"+(arr.length-1-i)+"] 수 비교 ("+arr[j]+","+arr[j+1]+")");
				if(arr[j] > arr[j+1]) {
					// 앞선 수와 뒤의 수를 비교하여 앞의 수가 더 크면 뒤로 보내기
					
					int swap = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = swap;
					//System.out.println("[j:"+j+"/"+(arr.length-1-i)+"] 수 비교 ("+arr[j]+","+arr[j+1]+") swap 발생");
				}
				
			}
			//System.out.println((i+1) +"회전 끝 => " + Arrays.toString(arr));
		}
		
		System.out.println("오름차순 정렬 완료 => " + Arrays.toString(arr));
		
	}
}

package day10;

import java.util.ArrayList;
import java.util.List;

public class _4_additionalQuiz {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {3,4,4,5};
		
		System.out.println(findIntersection(arr1, arr2));
	}

	private static List<Integer> findIntersection(int[] arr1, int[] arr2) {
		
		List<Integer> intersectionList = new ArrayList<Integer>(); 
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				if(arr1[i] == arr2[j]) {
		
					boolean isDuplicated = false;
					for(int k=0; k<intersectionList.size(); k++) {
						if(arr1[i] == intersectionList.get(k)) {
							isDuplicated = true;
							break;
						}
					}
					
					if(!isDuplicated) {
						intersectionList.add(arr1[i]);	
					}
				}
				
			}
		}
		
		return intersectionList; 
	}
}


// 두 개의 정수 배열이 주어졌을 때, 공통으로 포함된 숫자들만 중복 없이 리스트로 반환
//예시 입력: {1, 2, 3, 4}, {3, 4, 4, 5}
//예시 출력: [3, 4]
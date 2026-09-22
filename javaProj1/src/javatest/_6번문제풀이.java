package javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _6번문제풀이 {

	public static void main(String[] args) {
		
		int arr[] = { 3, 9, 6, 5, 4, 2, 15, 8 };
		
		List<Integer> oddList = new ArrayList<>();
		List<Integer> evenList = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenList.add(arr[i]);
			}else {
				oddList.add(arr[i]);
			}
		}
		
		// 웹 검색함. 구글 키워드: 
		// 1. java list sort
		// 2. java list sort desc
		// 참조 사이트: https://hianna.tistory.com/569#google_vignette
		Collections.sort(oddList);
		Collections.sort(evenList, Collections.reverseOrder());
		
//		System.out.println(oddList);
//		System.out.println(evenList);
		
		List<Integer> newList = new ArrayList<>();
		
		for(int i=0; i<oddList.size(); i++) {
			newList.add(oddList.get(i));
			newList.add(evenList.get(i));
		}
		
		System.out.println(newList);
	}
}

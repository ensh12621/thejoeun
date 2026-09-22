package javatest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _7번문제풀이 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("mysql");
		list.add("css");
		list.add("html");
		list.add("oracle");
		
		// 웹 참조 구글 키워드: java list sort
		// 참조 url: https://hianna.tistory.com/569
		
		Collections.sort(list);
		System.out.println(list);
	}
}

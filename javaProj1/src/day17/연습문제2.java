package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class 연습문제2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("oracle");
		list.add("java");
		list.add("html");
		list.add("oracle");
		System.out.println(list);
		
		Set<String> set = new HashSet<>();
		
		for(String str : list) {
			set.add(str);
		}
		
		List<String> nonDuplicatedList = set.stream().collect(Collectors.toList());
		System.out.println(nonDuplicatedList);
	}
}

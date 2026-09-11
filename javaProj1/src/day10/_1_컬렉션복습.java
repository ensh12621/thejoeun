package day10;

import java.util.ArrayList;
import java.util.List;

public class _1_컬렉션복습 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("김철수");
		list.add(1, "박영희");
		System.out.println(list);
		System.out.println(list.get(0));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(2);
		list.remove("홍길동");
		System.out.println(list);
		
		List<Human> humanList = new ArrayList<Human>();
		Human hong = new Human("홍길동");
		Human kim = new Human("김철수");
		humanList.add(hong);
		humanList.add(kim);
		System.out.println(humanList);
		
	}
}

package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Json2 {


	public static void main(String[] args) {
		Human[] hArr = {
				new Human("홍길동", 30),
				new Human("김철수", 30),
				new Human("박영희", 30),
				new Human("김김김", 30),
				new Human("하하하", 30)
		};
		
		List<Map<String,Object>> list = new ArrayList<>();
		
		for(Human human : hArr) {
			Map<String, Object> map = new HashMap<>();
			map.put("name", human.getName());
			map.put("age", human.getAge());
			
			list.add(map);
		}
		
		
		System.out.println(list);
		
	}
}

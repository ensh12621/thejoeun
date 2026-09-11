package day10;

import java.util.HashMap;
import java.util.Map;

public class _2_컬렉션복습 {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "홍길동");
		map.put("age", 30);
		map.put("height", 170.1);
		
		
		if(map.containsKey("age")) {
			System.out.println((Integer)map.get("age") + 1);	
		}
		
		
	}
}

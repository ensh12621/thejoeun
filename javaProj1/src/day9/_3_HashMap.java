package day9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _3_HashMap {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("홍길동", 95);
		map.put("김철수", 91);
		map.put("이영희", 98);
		
		System.out.println(map);
		System.out.println(map.get("홍길동"));
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		Iterator<String> keyIter = keys.iterator();
		int sum = 0;
		while(keyIter.hasNext()) {
			// System.out.println(keyIter.next());
			sum += map.get(keyIter.next());
		}

		System.out.println(sum);
	}
}

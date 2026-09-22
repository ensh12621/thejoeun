package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class 해시맵 {

	public static void main(String[] args) {
		
		// 1부터 10까지의 숫자를 10번 입력받고 (중복o) 
		// 각 숫자를 몇 번 입력했는지 출력
		// 1 => 3번, 2 => 1번, ... 10 => 3번
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();

		while(list.size() < 10) {
			System.out.print("("+(list.size()+1)+")숫자 입력: ");	
			int input = scanner.nextInt();
			if(input >= 1 && input <= 10) {
				list.add(input);	
			}
		}
		
		Map<String, Object> map = new HashMap<>();
		
		for(Integer n : list) {
			
//			System.out.println("for -- n => " + n);
//			System.out.println(map.get(n));
//			System.out.println("n == string.valOf() => " + n == String.valueOf(n));
//			System.out.println();
			if(map.get(String.valueOf(n)) == null) {
				map.put(String.valueOf(n), 1);
			}else {
				
				int newVal = (Integer)map.get(String.valueOf(n)) + 1;
				map.put(String.valueOf(n), newVal);
//				System.out.println("캐치 - " + newVal);
			}
		}
		
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.print(key + " => " + map.get(key) + "번, ");
		}
		System.out.println();
	}
}

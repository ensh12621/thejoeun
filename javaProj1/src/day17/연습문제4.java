package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class 연습문제4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 스캐너를 통해 문자열 입력
		// 각 문자가 몇 번 나오는지 출력 (대소문자 구분x)
		// ex) show me thue mnoey 입력하면
		// s => n개, h => n개, ...
		
		System.out.print("문자 입력: ");
		String input = scanner.nextLine();

		input = input.replaceAll(" ", "");
		
		Map<String, Integer> map = new HashMap<>();
		
		int i = 0;
		while(i < input.length()) {
			char ch = input.charAt(i);
			
			if(!map.containsKey(String.valueOf(ch).toLowerCase())) {
				map.put(String.valueOf(ch).toLowerCase(), 1);
			}else {
				Integer count = map.get(String.valueOf(ch));
				map.put(String.valueOf(ch).toLowerCase(), (count+1));
			}
			i++;
		}
		
		Iterator<String> iter = map.keySet().iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.print( key + " => " + map.get(key) + ", ");
		}
		System.out.println();
	}
}

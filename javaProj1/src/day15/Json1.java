package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Json1 {

	public static void main(String[] args) {

		// 리스트 안에 맵이 있는 형태
		// [{}, {}, ..., {}]
		Scanner scanner = new Scanner(System.in);
		List<Map<String, Object>> list = new ArrayList<>();

		for (int i = 1; i <= 3; i++) {
			System.out.println("=======" + (i + 1) + "번 사람 입력=========");
			Map<String, Object> map = new HashMap<>();

			System.out.print("학번: ");
			map.put("stuNo", scanner.next());

			System.out.print("이름: ");
			map.put("name", scanner.next());

			list.add(map);
		}
		
		System.out.println(list);
		
		System.out.print("검색할 이름: ");
		String keyword = scanner.next();
		
		boolean bFound = false;
		for(Map<String, Object> map : list) {
			if(map.get("name").equals(keyword)) {
				bFound = true;
				break;
			}
		}
		
		if(bFound) {
			System.out.println("존재합니다");
		}else {
			System.out.println("존재하지 않습니다");
		}
	}
}

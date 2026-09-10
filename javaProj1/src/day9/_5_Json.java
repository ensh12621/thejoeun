package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _5_Json {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Map<String, Object>> list = new ArrayList<>();
		System.out.println("==== 성적 입력 프로그램 ====");

		for (int i = 0; i < 3; i++) {
			Map<String, Object> map = new HashMap<>();
			System.out.print("이름:");
			map.put("name", scanner.next());
			System.out.print("자바 점수: ");
			map.put("java", scanner.nextInt());
			System.out.print("DB 점수: ");
			map.put("db", scanner.nextInt());
			
			list.add(map);
			System.out.println(" ============================= ");
		}

		System.out.println(list);
		scanner.close();
	}
}

package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _4_복습문제 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Map<String, Object>> list = new ArrayList<>();
		List<String> nameList = new ArrayList<>();
		System.out.println("========= 과일가게 프로그램 =========");

		while (true) {
			System.out.print("[ (1) 추가 (2) 가격수정 (3) 가격수정v2 (그 외) 종료 ] : ");
			int menu = scanner.nextInt();
			if (menu == 1) {
				System.out.print("과일이름: ");
				String fruitName = scanner.next();
				System.out.print("가격: ");
				int price = scanner.nextInt();

				Map<String, Object> map = new HashMap<String, Object>();
				map.put("name", fruitName);
				map.put("price", price);

				list.add(map);
				nameList.add(fruitName);
			} else if (menu == 2) {

				System.out.print("과일 이름: ");
				String fruitName = scanner.next();

				Map<String, Object> map = findByFruitName(list, fruitName);

				if (map != null) {
					System.out.print("가격 입력: ");
					int newPrice = scanner.nextInt();
					map.put("price", newPrice);

				} else {
					System.out.println("해당 과일은 없습니다.");
				}

			} else if (menu == 3) {
				System.out.print("과일 이름: ");
				String fruitName = scanner.next();
				if(nameList.contains(fruitName)) {
					int idx = nameList.indexOf(fruitName);
					Map<String, Object> fruitMap = list.get(idx);
					
					System.out.print("가격 입력: ");
					int newPrice = scanner.nextInt();
					fruitMap.put("price", newPrice);
				}else {
					System.out.println("해당 과일은 없습니다");
				}
			} else {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}
	}

	private static Map<String, Object> findByFruitName(List<Map<String, Object>> list, String fruitName) {
		for (Map<String, Object> map : list) {
			String dbFruitName = (String) map.get("name");
			if (dbFruitName.equals(fruitName))
				return map;
		}
		return null;
	}

}

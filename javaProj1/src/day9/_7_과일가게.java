package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _7_과일가게 {
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Map<String, Object>> list = new ArrayList<>();
		System.out.println("==== 과일가게 프로그램 ====");

		while (true) {
			System.out.print("[ (1) 과일등록 (2) 가격수정 (3) 미정 (그 외) 종료 ] : ");
			int menu = scanner.nextInt();
			if (menu == 1) {
				// 과일이름, 가격, 갯수 입력받아서 map에 저장 후 list에 저장
				Map<String, Object> map = new HashMap<String, Object>();

				String fruitName = null;

				System.out.println("과일 등록..");

				while (true) {
					System.out.print("과일이름: ");
					fruitName = scanner.next();

					boolean duplicated = false;

					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).get("name").equals(fruitName)) {
							duplicated = true;
							System.out.println("중복되는 과일이름입니다. 다른 과일 이름으로 입력해주세요.");
							break;
						}
					}

					if (!duplicated) {
						break;
					}
				}

				System.out.print("가격: ");
				int price = scanner.nextInt();

				System.out.println("갯수:");
				int quantity = scanner.nextInt();

				map.put("name", fruitName);
				map.put("price", price);
				map.put("quantity", quantity);

				list.add(map);
			} else if (menu == 2) {
				// 과일 이름 입력받아서 과일이 없으면 '해당 과일 없습니다' 출력
				// 있으면 가격 입력받아서 해당 가격으로 변경
				
				System.out.print("가격 변경할 과일이름: ");
				String fruitName = scanner.next();
				
				Map<String, Object> targetMap = null;
				for(Map<String, Object> map : list) {
					if(map.get("name").equals(fruitName)) {
						targetMap = map;
						break;
					}
				}
				
				if(targetMap != null) {
					System.out.print("변경할 가격: ");
					int newPrice = scanner.nextInt();
					targetMap.put("price", newPrice);
					
				}else {
					System.out.println("해당 과일 없습니다");
				}
				
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}

	}
}

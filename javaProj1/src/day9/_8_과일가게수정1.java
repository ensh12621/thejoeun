package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _8_과일가게수정1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Map<String, Object>> list = new ArrayList<>();
		System.out.println("==== 과일가게 프로그램 ====");

		while (true) {
			System.out.print("[ (1) 과일등록 (2) 가격수정 (3) 과일구매 (그 외) 종료 ] : ");
			int menu = scanner.nextInt();
			if (menu == 1) {
				Map<String, Object> map = new HashMap<String, Object>();
				String fruitName = null;
				System.out.println("과일 등록..");

				System.out.print("과일이름: ");
				fruitName = scanner.next();
				Map<String, Object> searchedFruit = FruitFunc.searchFruit(list, fruitName);

				if (searchedFruit != null) {
					System.out.println("이미 등록된 과일입니다.");
				} else {
					// System.out.print("가격: ");
					// int price = scanner.nextInt();
					int price = receivePositiveNumber(scanner, "가격: ");

					// System.out.print("갯수: ");
					// int count = scanner.nextInt();
					int count = receivePositiveNumber(scanner, "갯수: ");

					map.put("name", fruitName);
					map.put("price", price);
					map.put("count", count);
					list.add(map);
				}

			} else if (menu == 2) {
				// 과일 이름 입력받아서 과일이 없으면 '해당 과일 없습니다' 출력
				// 있으면 가격 입력받아서 해당 가격으로 변경

				System.out.print("가격 변경할 과일이름: ");
				String fruitName = scanner.next();

				Map<String, Object> searchedFruit = FruitFunc.searchFruit(list, fruitName);

				if (searchedFruit != null) {
//					System.out.print("변경할 가격: ");
//					int newPrice = scanner.nextInt();
					int newPrice = receivePositiveNumber(scanner, "변경할 가격: ");
					searchedFruit.put("price", newPrice);
				} else {
					System.out.println("해당 과일 없습니다");
				}
			} else if (menu == 3) {
				System.out.print("구매할 과일이름: ");
				String fruitName = scanner.next();
				Map<String, Object> searchedFruit = FruitFunc.searchFruit(list, fruitName);

				if (searchedFruit != null) {
//					System.out.print("구매할 과일 갯수: ");
//					int count = scanner.nextInt();

					buyFruit(scanner, searchedFruit);
					// searchedFruit.put("count", (Integer)searchedFruit.get("count") - count);
					System.out.println(searchedFruit);
				} else {
					System.out.println("해당 과일 없습니다.");
				}

			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

	private static void buyFruit(Scanner scanner, Map<String, Object> searchedFruit) {

		while (true) {
			int count = receivePositiveNumber(scanner, "구매할 과일 갯수: ");
			int countResult = (Integer) searchedFruit.get("count") - count;
			if (countResult > 0) {
				searchedFruit.put("count", countResult);
				int buyPrice = count * (Integer) searchedFruit.get("price");
				Integer remained = (Integer) searchedFruit.get("count");

				System.out.println(buyPrice + "원 만큼 구매하였습니다.");
				System.out.println("현재 남은 과일의 개수는 " + remained + "개 입니다.");
				break;
			} else {
				System.out.println("갯수를 초과하여 구매할 수 없습니다.");
				System.out.println("현재 남은 사과의 갯수는 "+(Integer)searchedFruit.get("count")+"개 입니다.");
			}
		}

	}

	private static int receivePositiveNumber(Scanner scanner, String prompt) {
		while (true) {

			System.out.print(prompt);
			int num = scanner.nextInt();
			if (num > 0) {

				return num;
			}
			System.out.println("0보다 큰 수를 입력해주세요.");
		}
	}
}

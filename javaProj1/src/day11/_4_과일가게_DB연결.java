package day11;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class _4_과일가게_DB연결 {

	static DBClass db = new DBClass();
	static Statement stmt = db.getStmt();
	static Scanner scanner = new Scanner(System.in);

	public static void addFruit() {
		System.out.println("=== 과일 추가 ===");

		String fruitName = receiveFruitName();

		if (fruitName != null && fruitName.equals("exists")) {
			System.out.println("이미 존재하는 과일입니다.");
			return;
		}

		int price = receivePositiveNumber("가격: ");
		int cnt = receivePositiveNumber("갯수: ");

		try {
			String sql = "insert into fruit(fruit_name, price, cnt)" + " values('" + fruitName + "', " + price + ", "
					+ cnt + ")";
			int nUpdated = stmt.executeUpdate(sql);
			if (nUpdated > 0) {
				System.out.println("과일 추가 완료하였습니다.");
			} else {
				System.out.println("알 수 없는 이유로 과일 추가에 실패하였습니다.");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	private static int receivePositiveNumber(String prompt) {
		System.out.print(prompt);
		int val = scanner.nextInt();

		if (val < 0) {
			System.out.println("1 이상의 값으로 입력해주세요.");
			return receivePositiveNumber(prompt);
		}

		return val;
	}

	private static String receiveFruitName() {
		System.out.print("과일 이름: ");
		String fruitName = scanner.next();

		String sql = "select fruit_name from fruit where fruit_name = '" + fruitName + "'";

		try {
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				return "exists";
			} else {
				return fruitName; // 신규 과일명 입력을 위해.
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return null;
	}

	public static void deleteFruit() {
		// 정말 삭제하시겠습니까? y/Y
		// 과일 이름 입력받아서 db에 삭제요청
		// 삭제 성공하면 삭제되었습니다. 출력
		// 실패 => 과일이름을 확인해주세요.

		System.out.print("삭제할 과일 이름 입력: ");
		String fruit = scanner.next();

		System.out.print("정말 삭제하시겠습니까?(y)");
		String keepGoing = scanner.next().toLowerCase();
		if (!keepGoing.equals("y")) {
			return;
		}

		String sql = "delete from fruit where fruit_name = '" + fruit + "'";

		try {
			int nUpdated = stmt.executeUpdate(sql);
			if(nUpdated > 0) {
				System.out.println("과일 "+fruit+"을(를) 성공적으로 삭제하였습니다.");
			}else {
				System.out.println("과일 이름을 확인해주세요.");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public static void updateFruit() {
		System.out.println("=== 과일 수정 ===");
		// 과일 이름 입력 -> 과일 존재o => 현재 가격 출력
		// 새로운 가격 입력받기 => 업데이트
		// 과일 존재 x => 해당 과일 없습니다.

		System.out.print("과일 이름: ");
		String fruitName = scanner.next();

		String sql = "select fruit_name from fruit where fruit_name = '" + fruitName + "'";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				System.out.print("새로운 가격 입력: ");
				int newPrice = scanner.nextInt();

				sql = "update fruit set price = " + newPrice + " where fruit_name = '" + fruitName + "'";
				int nUpdated = stmt.executeUpdate(sql);
				if (nUpdated == 1) {
					System.out.println("가격 수정 완료하였습니다. 현재 가격은 " + newPrice + "원입니다.");
				} else {
					System.out.println("알 수 없는 이유로 가격 수정에 실패하였습니다.");
				}
			} else {
				System.out.println("해당 과일은 없습니다.");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void sellFruit() {
		System.out.println("=== 과일 판매 ===");

	}

	public static void checkFruit() {
		System.out.print("과일이름: ");
		String fruitName = scanner.next();
		String sql = "select * from fruit where fruit_name = '" + fruitName + "'";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				System.out.println(fruitName + "의 가격은 " + rs.getInt("price") + "원 입니다.");
				System.out.println("남은 개수는 " + rs.getInt("cnt") + "개 입니다.");
			} else {
				System.out.println("해당 과일은 존재하지 않습니다.");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

		try {
			mainLoop: while (true) {
				System.out.print("[(1)과일추가 (2)가격수정 (3)판매 (4)과일확인 (5)과일삭제 (그외)종료] : ");
				int menu = scanner.nextInt();

				switch (menu) {
				case 1:
					addFruit();
					break;
				case 2:
					updateFruit();
					break;
				case 3:
					sellFruit();
					break;
				case 4:
					checkFruit();
					break;
				case 5:
					deleteFruit();
					break;
				default:
					System.out.println("종료되었습니다.");
					break mainLoop;
				}

			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}

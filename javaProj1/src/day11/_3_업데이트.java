package day11;

import java.sql.Statement;
import java.util.Scanner;

public class _3_업데이트 {
	public static void main(String[] args) {
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("과일 이름 입력: ");
			String fruit = scanner.nextLine();
			
			System.out.print("과일 가격: ");
			int price = scanner.nextInt();
			
			String sql = "update fruit set price = " + price + " where fruit_name = '"+fruit +"'";
			int nUpdated = stmt.executeUpdate(sql);
			
			if(nUpdated > 0) {
				System.out.println("수정되었습니다.");
			}else {
				System.out.println("없는 과일입니다.");
			}
			
			
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}

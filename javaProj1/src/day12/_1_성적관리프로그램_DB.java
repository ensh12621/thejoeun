package day12;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day11.DBClass;

public class _1_성적관리프로그램_DB {
	static DBClass db = new DBClass();
	static Statement stmt = db.getStmt();
	static Scanner s = new Scanner(System.in);

	public static final int FIELD_JAVA = 1;
	public static final int FIELD_ORACLE = 2;
	public static final int FIELD_HTML = 3;

	public static void inputScore() {
		// 성적 입력
		// 테이블명 : STUDENT, 컬럼 : STU_NO(학번), STU_NAME(이름), JAVA(자바점수), ORACLE(오라클점수),
		// HTML(HTML점수)
		// 학번, 이름, 3개 과목의 점수를 입력받아 STUDENT 테이블에 저장
		// 조건 1. 학번은 무조건 4글자(4자리 숫자). 잘못 입력할 경우 다시 입력받도록 함.
		// 조건 2. 학번은 중복되면 안됨(PK). 학번 입력받은 후 검색해보고 없을 경우 삽입
		// 중복된 학번을 입력할 경우 알림 메시지 후 메뉴로 이동 함.
		// 조건 3. 각 과목의 점수는 0~100 사이 값이여야 함.
		// 잘못된 범위를 입력할 경우 다시 입력받도록 함.

		String stuNo = receiveStudNo();
		if (existsStuNo(stuNo)) {
			System.out.println("중복된 학번입니다! 다시 입력해주세요.");
			return;
		}

		System.out.print("학생이름: ");
		String studName = s.next();

		int java = inputInRange("JAVA: ", 0, 100);
		int oracle = inputInRange("ORACLE: ", 0, 100);
		int html = inputInRange("HTML: ", 0, 100);

		String sql = "insert into student(stu_no, stu_name, java, oracle, html) values " + "(" + stuNo + ", '"
				+ studName + "' ," + java + "," + oracle + "," + html + ")";

		try {
			System.out.println(sql);
			int nInserted = stmt.executeUpdate(sql);
			if (nInserted == 1) {
				System.out.println("학생 정보 입력을 완료하였습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

	private static int inputInRange(String prompt, int min, int max) {

		while (true) {

			System.out.print(prompt);
			int input = s.nextInt();

			if (input >= min && input <= max) {
				return input;
			}
			System.out.println(min + "부터 " + max + "까지의 숫자로 입력해주세요.");
		}
	}

	private static boolean existsStuNo(String studNo) {
		String sql = "select 1 from student where stu_no = '" + studNo + "'";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			return rs.next();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	private static String receiveStudNo() {
		while (true) {

			System.out.print("학번 입력: ");
			String studNo = s.next();

			if (studNo.length() == 4) {
				return studNo;
			}

			System.out.println("올바른 학번을 입력해주세요.");
		}
	}

	public static void rank() {
		// 순위 출력
		// 1등 : ooo(학번), ooo(이름), oo점(평균점수)
		// 2등 : ooo(학번), ooo(이름), oo점(평균점수)
		// ..
		// oo등 : ooo(학번), ooo(이름), oo점(평균점수)

		System.out.println("순위출력..");
		String sql = "select stu_no, stu_name, (java + oracle + html) / 3 as avg " + "from student "
				+ "order by avg desc";
		// System.out.println(sql);
		try {

			ResultSet rs = stmt.executeQuery(sql);

			int rank = 1;
			while (rs.next()) {
				String stuNo = rs.getString("stu_no");
				String stuName = rs.getString("stu_name");
				int avg = rs.getInt("avg");

				System.out.println(rank + "등 : " + stuNo + ", " + stuName + ", " + avg + "점");

				rank++;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

	}

	public static void updateScore() {
		// 성적 수정
		// 학번을 입력받은 후 해당 학생의 과목 점수 수정
		// 입력한 학번의 학생이 없을 경우 메뉴로 이동
		// 학번이 있을 경우 새로운 메뉴 '[ (1) 자바 (2) 오라클 (3) HTML ]' 을 띄우고
		// 선택한 메뉴의 점수만 입력받아서 수정( ex : 2번 선택 후 점수 입력받으면 오라클 점수만 수정 )
		// 1~3번 외에 다른 숫자 입력 시 다시 입력받도록 하며, 점수의 범위는 0~100 사이

		String studNo = receiveStudNo();
		if (!existsStuNo(studNo)) {
			System.out.println("존재하지 않는 학번입니다.");
			return;
		}

		int command = inputInRange("[ (1) 자바 (2) 오라클 (3) HTML ] : ", 1, 3);

		switch (command) {

		case 1:
			updatePointField(studNo, FIELD_JAVA);
			break;

		case 2:
			updatePointField(studNo, FIELD_ORACLE);
			break;
		case 3:
			updatePointField(studNo, FIELD_HTML);
			break;
		}

	}

	private static void updatePointField(String stuNo, int fieldJava) {

		String subject;

		if (fieldJava == FIELD_JAVA) {
			subject = "java";

		} else if (fieldJava == FIELD_ORACLE) {
			subject = "oracle";

		} else if (fieldJava == FIELD_HTML) {
			subject = "html";
		} else {
			subject = "java";
		}

		int point = inputInRange("점수 입력: ", 0, 100);

		String sql = "update student set " + subject + " = " + point + " where stu_no = '" + stuNo + "'";
		System.out.println(sql);

		try {
			int nUpdated = stmt.executeUpdate(sql);
			if (nUpdated == 1) {
				System.out.println("점수 수정을 완료하였습니다.");
			} else {
				System.out.println("얘기치 못한 오류가 발생하였습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void removeScore() {
		// 삭제
		// 학번을 입력받은 후 해당 학번을 가진 학생 삭제
		// 따로 중복체크 없이 삭제 요청 후 삭제 여부에 따라 성공or실패 메시지 출력
		// 삭제하기전 정말 삭제할지 (Y or N) 묻고 진행
		String stuNo = receiveStudNo();

		System.out.print("정말로 삭제하시겠습니까?(Y or N)");
		String keepGoing = s.next();
		if (!keepGoing.toLowerCase().equals("y")) {
			return;
		}

		String sql = "delete from student where stu_no = '" + stuNo + "'";
		try{
			int nDeleted = stmt.executeUpdate(sql);
			if(nDeleted == 1) {
				System.out.println("학생정보를 삭제하였습니다.");
			}else {
				System.out.println("학생 정보 삭제에 실패하였습니다. 학번을 확인해주세요.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void passFail() {
		// pass or fail
		// 학번 입력 후 해당 학번 학생이 있을 경우 pass or fail 여부 알려주기
		// 학번 없을 경우 메뉴로 이동
		// pass여부는 평균 점수가 60점 이상이며, 한과목이라도 40점 미만이 있을 경우 fail
		// 출력할때는 평균점수와 각 과목의 점수, pass or fail 여부를 출력
		
		String stuNo = receiveStudNo();
		if (!existsStuNo(stuNo)) {
			System.out.println("존재하지 않는 학번입니다.");
			return;
		}
		
		String sql = "select java, oracle, html, (java + oracle + html)/3 as avg from student where stu_no = '"+stuNo+"'";
		try{
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int java = rs.getInt("java");
				int oracle = rs.getInt("oracle");
				int html = rs.getInt("html");
				int avg = rs.getInt("avg");
				
				if(avg >= 60 && java >= 40 && oracle >= 40 && html >= 40) {
					System.out.println("pass");
				}else {
					System.out.println("fail");
				}
			}else {
				System.out.println("얘기치 못한 오류가 발생하였습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {

			mainLoop: while (true) {
				System.out.print("[ (1) 성적입력 (2) 순위 (3) 성적수정 (4) 삭제 (5) 합격여부 (그 외) 종료 ] : ");
				int menu = s.nextInt();

				switch (menu) {
				case 1:
					inputScore();
					break;
				case 2:
					rank();
					break;
				case 3:
					updateScore();
					break;
				case 4:
					removeScore();
					break;
				case 5:
					passFail();
					break;
				default:
					System.out.println("종료되었습니다.");
					break mainLoop;
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
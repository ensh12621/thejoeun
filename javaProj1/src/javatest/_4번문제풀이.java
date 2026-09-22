package javatest;

public class _4번문제풀이 {

	public static void main(String[] args) {

		String filename = "my_project.version2.java";
		int startIdx = filename.lastIndexOf(".") + 1;
		String extensionName = filename.substring(startIdx);
		System.out.println("출력 결과 : " + extensionName);
	}
}

package day16;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("C:\\Users\\tjoeu\\OneDrive\\바탕 화면\\kkh\\todo.txt");
			int c;
			while ((c = fin.read()) != -1) { // 한문자씩파일끝까지읽기
				System.out.print((char) c);
			}
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력오류");
		}
	}
}

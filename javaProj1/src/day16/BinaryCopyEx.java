package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopyEx {
	public static void main(String[] args) {

		
		double beforeTime = System.currentTimeMillis();
		
		File src = new File("C:\\Users\\tjoeu\\OneDrive\\바탕 화면\\kkh\\i17211808431.jpg");
		File dest = new File("C:\\Users\\tjoeu\\OneDrive\\바탕 화면\\kkh\\i17211808431_2.jpg");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest); 
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
	
			fi.close();
			fo.close();
			
			
			
			System.out.println(src.getPath()+ "를 " + 
				dest.getPath()+ "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
		
		double afterTime = System.currentTimeMillis();
		
		double diffTime = (afterTime - beforeTime) / 1000;
		System.out.println("시간차이: " + diffTime);
		
	}
}

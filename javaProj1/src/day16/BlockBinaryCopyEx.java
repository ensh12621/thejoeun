package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BlockBinaryCopyEx {

	public static void main(String[] args) {
		double beforeTime = System.currentTimeMillis();

		File src = new File("C:\\\\Users\\\\tjoeu\\\\OneDrive\\\\바탕 화면\\\\kkh\\\\i17211808431.jpg");
		File dest = new File("C:\\\\Users\\\\tjoeu\\\\OneDrive\\\\바탕 화면\\\\kkh\\\\i17211808431_2");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte[1024 * 10]; // 10KB 버퍼
			while (true) {
				int n = fi.read(buf); // 버퍼크기만큼읽기. n은실제읽은바이트
				fo.write(buf, 0, n); // buf[0]부터n 바이트쓰기
				if (n < buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를" + dest.getPath() + "로복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일복사오류");
		}

		double afterTime = System.currentTimeMillis();

		double diffTime = (afterTime - beforeTime) / 1000;
		System.out.println("시간차이: " + diffTime);

	}
}

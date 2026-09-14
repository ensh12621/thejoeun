package day11;

import java.util.HashMap;
import java.util.Map;

class Tuple {
	private String key;
	private Integer value;

	public Tuple(String key, Integer value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Tuple [key=" + key + ", value=" + value + "]";
	}
}

public class Quiz3 {

	public static void main(String[] args) {

		// String input = "aaabbcddd";
		String input = "bbffghrhhhhtbb";
		System.out.println(compressString2(input));
	}

	private static String compressString2(String input) {

		Map<Integer, Tuple> map = new HashMap<>();

				// TODO :크아악 해결못했다
				
		
		
		return null;
	}

	private static String compressString(String input) {

		int nDup = 0;
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < input.length() - 1; i++) {
			char val = input.charAt(i);
			char nextVal = input.charAt(i + 1);

			// System.out.println(i + ", " + (input.length() - 1 - 1));

			if (i == (input.length() - 1 - 1)) {
				buffer.append(val);
				buffer.append(String.valueOf(nDup + 2));
			} else if (val == nextVal) {
				nDup++;
				// System.out.println("val, nextVal => (" + val + "," + nextVal + ") dup(" +
				// nDup + ")");
			} else {
				// System.out.println("val, nextVal => (" + val + "," + nextVal + ") dup " +
				// (nDup + 1));
				buffer.append(val);
				if (nDup > 0) {
					buffer.append(String.valueOf(nDup + 1));
					nDup = 0;
				}

			}
		}

		return buffer.toString();
	}
}

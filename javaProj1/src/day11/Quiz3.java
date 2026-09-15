package day11;

public class Quiz3 {

	public static void main(String[] args) {

		// String input = "aaabbcddd";
		String input = "bbffghrhhhhtbb";
		System.out.println(compressString2(input));
	}

	private static String compressString2(String input) {

		StringBuffer buffer = new StringBuffer();
		
		buffer.append(input.charAt(0));
		
		char currentChar = input.charAt(0);
		int nDuplicated = 1;
		for(int i=0; i<input.length(); i++) {
			
			if(currentChar == input.charAt(i)) {
				System.out.println(input.charAt(i) + ", if()");
				nDuplicated++;
				buffer.append(currentChar);
			}else {
				System.out.println(input.charAt(i) + ", else()");
				// buffer.append(currentChar);
				if(nDuplicated > 1) {
					buffer.append(String.valueOf(nDuplicated));
				}
				currentChar = input.charAt(i);
				nDuplicated = 1;
			}
		}
		buffer.append(currentChar);
		
		if(nDuplicated > 1) {
			buffer.append(nDuplicated);
		}
		
		// 오답임.. 모르겠다 하..
		
		return buffer.toString();
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

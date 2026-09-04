package middleTest;

import java.util.Arrays;
import java.util.Scanner;

public class Question6and7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			
			int targetIdx = i;

			while (true) {
				System.out.print("[" + (i + 1) + "]숫자입력: ");	
				arr[i] = scanner.nextInt();

				if (arr[i] <= 0) {
					System.out.println("0 이하의 수를 입력하시면 안됩니다.");
				} else {
					boolean isDuplicated = false;

					for (int j = 0; j < arr.length; j++) {
						if (targetIdx == j)
							continue;
						else {
							if (arr[i] == arr[j]) {
								// System.out.println("겹침 - " + arr[j] + ", " + arr[i]);
								isDuplicated = true;
								break;
							}
						}
					}

					if (isDuplicated) {
						System.out.println("중복된 숫자를 입력하시면 안됩니다.");
					} else {
						break;
					}

				}

			}

		}
		
		System.out.println("결과 배열 => " + Arrays.toString(arr));

		int oddSum = 0;
		int evenSum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenSum += arr[i];
			}else {
				oddSum += arr[i];
			}
		}
		
		System.out.println("홀수들의 합: " + oddSum);
		System.out.println("짝수들의 합: " + evenSum);
		
	}
}

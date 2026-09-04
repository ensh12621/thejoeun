package day5;

import java.util.Arrays;

public class _7_Value_Ref {

	static void valueMehtod(int a) {
		a = a + 1;
	}

	static void refMethod(int[] qqq) {
		qqq[3] = 1000;
	}

	static void refMethod2(Animal animal) {
		animal.age += 1;
	}

	public static void main(String[] args) {
		int a = 10;
		valueMehtod(a);
		System.out.println(a);

		int[] arr = { 1, 2, 3, 4, 5 };
		refMethod(arr);
		System.out.println(Arrays.toString(arr));

		Animal dog = new Animal("강아지", "댕댕이", 5);
		System.out.println("메서드 호출 전: " + dog.age);
		refMethod2(dog);
		System.out.println("메서드 호출 후: " + dog.age);

		int[] arr2 = { 3, 5, 2, 4, 1 };
		int[] copyArr = new int[arr2.length];
		for(int i=0; i<arr2.length; i++) {
			copyArr[i] = arr2[i];
		}
		System.out.println(arr2 != copyArr);
		
	}
}

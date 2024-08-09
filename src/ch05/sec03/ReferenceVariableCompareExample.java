package ch05.sec03;

import java.util.Arrays;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;

		// 같은 배열같아 보이지만 사실은 값만 같은 다른 배열을 가르킴
		arr1 = new int[] { 1, 2, 3 };
		arr2 = new int[] { 1, 2, 3 };
		// 같은 배열를 가르키게 됨
		arr3 = arr2;

		// 배열은 참조타입 스택 영역에 번지수를 저장
		// 이렇게 출력하게 되면 배열의 번지수가 출력
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		// Arrays.toString()매서드 사용
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));

		// arr1 과 arr2는 같은 배열객체가 아님
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
	}

}

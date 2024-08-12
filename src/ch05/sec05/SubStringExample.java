package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		//substring(num1,num2) num1인덱스부터 시작해서 num2인덱스 까지 문자열 잘라내기
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
			
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}

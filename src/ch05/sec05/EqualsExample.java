package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		//문자열에 같은 리터럴을 대입하는 경우 같은 객체를 참조함
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 참조가 같음");
		}else {
			System.out.println("str1과 str2는 참조가 다름");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 문자열이 같음");
		}
		//new연산자는 새로운 객체를 생성
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		
		if(str3 == str4) {
			System.out.println("str3과 str4는 참조가 같음");
		}else {
			System.out.println("str3과 str4는 참조가 다름");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3과 str4는 문자열이 같음");
		}
		String hobby = "";
		if(hobby.equals("")) {
			System.out.println("hobby가 참조하는 String객체는 빈 문자열입니다.");
		}
	}

}

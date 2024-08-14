package ch06.sec11;

public class KoreanExample {

	public static void main(String[] args) {
		//객체 생성 시 주민등록번호와 이름 전달
		Korean k1 = new Korean("123456-1234567","감자바");
		
		//필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//fianl 필드는 값을 변경 할 수 없음
//		k1.nation = "USA";
		
		k1.name = "김자바";
	}

}

package ch05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		//indexOf(String) 문자열이 존재하면 시작점의 인덱스를 반환 없으면 -1반환
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		System.out.println(subject.substring(location));
		System.out.println(subject.replace("자바","파이썬"));
		
		//contains(String) 문자열이 존재하는지 불리언값으로 리턴
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련된 책이 아니군요");
		}
	}

}

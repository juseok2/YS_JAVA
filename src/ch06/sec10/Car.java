package ch06.sec10;

public class Car {
	//인스턴스 필드 선언
	int speed;
	
	//인스턴스 메소드 선언
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	static void simulate() {
		//객체생성
		//정적 메소드에서는 인스턴스 필드에 바로 접근할 수 없음 객체를 생성 한 다음 참조변수로 접근 가능
		Car myCar = new Car();
		//인스턴스 멤버 사용
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		//정적 메소드 호출
		simulate();
		
		//객체 생성
		Car myCar = new Car();
		//인스턴스 멤버 사용
		myCar.speed = 60;
		myCar.run();
	}
}

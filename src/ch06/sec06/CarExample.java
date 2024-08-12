package ch06.sec06;
import java.util.Scanner;
public class CarExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Car객체 생성
		Car myCar = new Car();
		
		//Car객체의 필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		//Car객체의 speed값 변경
		System.out.print("속도를 입력하세요> ");
		int speed = scanner.nextInt();
		myCar.speed = speed;
		System.out.println("수정된속도: " + myCar.speed);
	}

}

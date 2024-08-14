package ch06.sec09;

public class CarExmaple {

	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.setSpeed(200);
		myCar.run();
		yourCar.setSpeed(300);
		yourCar.run();
	}

}

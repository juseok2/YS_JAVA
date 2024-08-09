package ch03.sec04;

public class AccuracyExample {
	
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		double result = apple - number*pieceUnit;
		System.out.println("남은양: " + result);
		
		//정수형 연산이 더 정확하게 연산 됨
		int apple2 = 1;
		int totalPieces = apple2*10;
		int number2 = 7;
		
		int result2 = totalPieces - number2;
		System.out.println("남은양: " + result2/10.0);
	}
}

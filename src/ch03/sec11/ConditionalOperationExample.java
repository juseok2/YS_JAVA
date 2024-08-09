package ch03.sec11;
import java.util.Scanner;
public class ConditionalOperationExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		String str1 = scanner.nextLine();
		int score = Integer.parseInt(str1);
		char grade = (score > 90) ? 'A':((score > 80) ? 'B' : 'C');
		System.out.printf("%d 점은 %c등급 입니다",score,grade);
	}

}

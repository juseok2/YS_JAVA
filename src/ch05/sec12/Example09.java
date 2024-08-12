package ch05.sec12;
import java.util.Scanner;
public class Example09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String student = "0";
		int[] scores = null;
		int maxScore = 0;
		int sum = 0;
		double avgScore = 0.0;
		while(true) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택>");
			String menu = scanner.nextLine();
			int menuNum = Integer.parseInt(menu); 
			switch(menuNum) {
			case 1:{
				System.out.print("학생수>");
				String student2 = scanner.nextLine();
				int studentnum = Integer.parseInt(student2);
				scores = new int[studentnum];
				break;
			}
			case 2: 
				for(int i=0;i<scores.length;i++) {
					System.out.print("scores["+i+"]>");
					String score = scanner.nextLine();
					int scoreNum = Integer.parseInt(score);
					scores[i] = scoreNum;
				}
				break;
			case 3: 
				for(int i=0;i<scores.length;i++) {
					System.out.print("scores["+i+"]:");
					System.out.print(scores[i]+"\n");
				}
				break;
			case 4: 
				for(int score : scores) {
					if(score>maxScore) {
						maxScore = score;
					}
				}
				for(int score : scores) {
					sum += score;
				}
				avgScore = (double) sum/scores.length;
				System.out.println("최고 점수: "+maxScore);
				System.out.println("최고 점수: "+avgScore);
				break;
			case 5: 
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			}
		}

	}

}

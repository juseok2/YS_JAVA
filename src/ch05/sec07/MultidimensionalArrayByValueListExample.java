package ch05.sec07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		int[][] scores = {
			{80,90,96},
			{76,88}
		};
		System.out.println("1차원 배열의 길이(반의 수): "+scores.length);
		System.out.println("2차원 배열의 길이(첫번째 반의 학생수): "+scores[0].length);
		System.out.println("2차원 배열의 길이(두번째 반의 학생수): "+scores[1].length);
		
		System.out.println("첫번째 반의 첫번째 학생의 점수: "+scores[0][0]);
		System.out.println("두번째 반의 두번째 학생의 점수: "+scores[1][1]);
		
		int class1Sum = 0;
		//첫번째 반의 평균점수
		for(int i=0;i<scores[0].length;i++) {
			class1Sum += scores[0][i];
		}
		double class1avg = (double)class1Sum/scores[0].length;
		System.out.println("첫번째 반의 평균점수는: " + class1avg);
		
		int class2Sum = 0;
		//두번째 반의 평균점수
		for(int i=0;i<scores[1].length;i++) {
			class2Sum += scores[1][i];
		}
		double class2avg = (double)class2Sum/scores[1].length;
		System.out.println("두번째 반의 평균점수는: " + class2avg);
	}

}

package ch03.sec09;

public class BitShiftExampe {

	public static void main(String[] args) {
		int num1 = 1;
//		1의 비트를 왼쪽으로 3칸 이동 빈 자리는 0으로 채움
		int result1 = num1 << 3;
//		Math.pow(num1 , num2) num1의 num2승을 반환 2의3승인 8을 반환(double형)
		int result2 = num1 * (int) Math.pow(2,3);
		System.out.println(result1);
		System.out.println(result2);
		
		int num2 = -8;
//		-8 의 비트를 오른쪽으로 3칸 이동 빈자리는 부호비트와 같은 값으로 채움
		int result3 = num2 >> 3;
		int result4 = num2 / (int)Math.pow(2,3);
		System.out.println(result3);
		System.out.println(result4);
	}

}

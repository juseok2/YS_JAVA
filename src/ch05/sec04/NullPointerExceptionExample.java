package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		int[] intArray = null;
		//참조하고 있는 배열객체가 없기 때문에  NullPointerException 예외 발생
		//intArray[0] = 10;
		
		String str = null;
		//참조하고 있는 문자열객체가 없기 때문에  NullPointerException 예외 발생
//		System.out.println(str.length()); 
	}

}

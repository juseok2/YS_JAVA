package ch02.sec09;

public class StringConcatExample {

	public static void main(String[] args) {
		int intResult = 10+3+8;
		System.out.println(intResult);
		
		String strResult = 10+3+"8";
		System.out.println(strResult);
		
		strResult = 10+"3"+8;
		System.out.println(strResult);
		
		strResult = "10"+(3+8);
		System.out.println(strResult);
	}

}

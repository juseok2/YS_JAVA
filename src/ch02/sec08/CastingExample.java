package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 10;
		byte byteValue = (byte)intValue;
		System.out.println(intValue + " => " + byteValue);
		
		intValue = 128;
		byteValue = (byte)intValue;
		System.out.println(intValue + " => " + byteValue);
		
		intValue = 256;
		byteValue = (byte)intValue;
		System.out.println(intValue + " => " + byteValue);
		
		long var1 = 300;
		int var2 = (int)var1;
		System.out.println(var2);
		
		int var3 = 65;
		char var4 = (char)var3;
		System.out.println(var4);
		
		double var5 = 3.14;
		int var6 = (int)var5;
		System.out.println(var6);
	}

}

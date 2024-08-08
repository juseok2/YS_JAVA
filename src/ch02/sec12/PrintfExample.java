package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		System.out.println("날짜\t품목\t단가\t수량 \t금액");
		System.out.println("3/7\t카라멜마끼야또\t20000\t1 \t20000");
		System.out.println("12/15\t라떼\t1000\t2 \t2000");
		System.out.println("4/8\t아이스아메리카노(샷추가)\t2000\t3 \t6000");

		System.out.printf("%-5s %-30s %-7s %-5s %-5s\n", "날짜","품목","단가","수량","금액");
		System.out.printf("%02d/%02d %-30s %7d %5s %5s\n",3,7,"아이스아메리카노샷추가",20000,"1","20000");
		System.out.printf("%02d/%02d %-30s %7d %5s %5s\n",12,15,"아이스아메리카노샷추가",1000,"2","2000");
		System.out.printf("%02d/%02d %-30s %7d %5s %5s\n",4,8,"아이스아메리카노샷추가",2000,"3","6000");
		
		System.out.printf("%-5s %-30s %-7s %-5s %-5s\n", "날짜","품목","단가","수량","금액");
		System.out.printf("%02d/%02d %-30s %7d %5s %5s\n", 3,7,"아이스아메리카노샷추가",20000,"1","20000");
		System.out.printf("%02d/%02d %-30s %7d %5s %5s\n", 12,15,"아이스아메리카노샷추가",1000,"2","2000");
		System.out.printf("%02d/%02d %-30s %7d %5s %5s\n", 4,8,"아이스아메리카노샷추가",2000,"3","6000");
	}

}

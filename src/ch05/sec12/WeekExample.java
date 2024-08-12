package ch05.sec12;
import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		// 열거타입 변수 선언
		Week today = null;
		//열거 값 대입
		 today = Week.THURSDAY;
		 
		 //컴퓨터의 요일정보 얻기
		 Calendar now = Calendar.getInstance();
		 
		 //현재 시간 얻기
		 int week = now.get(Calendar.YEAR);
		 int week2 = now.get(Calendar.MONTH);
		 int week3 = now.get(Calendar.DAY_OF_MONTH);
		 System.out.printf("%d%02d%d\n",week,week2+1,week3);

		 switch(week) {
		 case 1: today = Week.SUNDAY; break;
		 case 2: today = Week.MONDAY; break;
		 case 3: today = Week.TUESDAY; break;
		 case 4: today = Week.WEDNESDAY; break;
		 case 5: today = Week.THURSDAY; break;
		 case 6: today = Week.FRIDAY; break;
		 case 7: today = Week.SATURDAY; break;
		 }
		//열거값 비교
		 System.out.println(today);
		 if(today == Week.SUNDAY) {
			 System.out.println("일요일에는 축구를 합니다.");
		 }else {
			 System.out.println("열심히 자바공부를 합니다.");
		 }
	}

}

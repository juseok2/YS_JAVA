package ch06.ex;

public class MemberService {
	
	public boolean login(String id, String password) {
		if(id == "hong" && password == "12345") {
			return true;
		}
		return false;
	}
	
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}

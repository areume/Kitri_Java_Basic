package ch00.quiz.ex0506_01;

/**
 * @author : 김아름
 * @date   : 2020. 5. 6.
 * @description : 
 */

class Member {
	private String name;		// 이름
	private String id;			// 아이디
	private String password;	// 패스워드
	private int age;			// 나이
	
	public boolean login(String id, String password) {
		if(id=="hong" && password=="1234") {
			return true;
		}
		return false;
	}
	
	public void logout(String id) {
		System.out.println("hong 로그아웃 되었습니다.");
	}
}

public class Quiz10 {

	public static void main(String[] args) {
		Member m=new Member();
		boolean check=m.login("hong", "1234");
		if(check==true) {
			m.logout("hong");
		}
	}
}

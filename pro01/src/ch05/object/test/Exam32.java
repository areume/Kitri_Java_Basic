package ch05.object.test;

/**
 * @author : 김아름
 * @date   : 2020. 5. 6.
 * @description : 함수 - 지정 예약어 static, final
 */

class KK {
	
	public void aa() {
		System.out.println("aa 함수 호출");
		
		// 일반 함수 호출 가능
		bb();
		this.bb();
		
		// static 함수 호출 가능
		cc();
		KK.cc();
		
		// final static 함수 호출 가능
		ff();
		KK.ff();
	}
	
	public void bb() {
		System.out.println("bb 함수 호출");
	}

	public static void cc() {
		System.out.println("cc 함수 호출");
		
		// bb(); -- ERROR! static 함수는 static으로 선언된 변수, 함수만 외부에서 가져올 수 있다.
		// ee(); -- ERROR!
		dd();
		ff();
	}
	
	public static void dd() {
		System.out.println("dd 함수 호출");
	}
	
	// final 로 선언된 함수는 상속되지 않는다.
	public final void ee() {
		System.out.println("ee 함수 호출");
	}
	
	public final static void ff() {
		System.out.println("ff 함수 호출");
	}
}

public class Exam32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

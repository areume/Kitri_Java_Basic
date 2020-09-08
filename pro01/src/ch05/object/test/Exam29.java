package ch05.object.test;

class YY {
	private int x;
	public int y;
	private static int a;
	public static int b;
	// 접근 제한 / 지정 예약어
	
	public void setDate(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void sub(int a, int b) {
		YY.a=a;
		YY.b=b; // this로 접근할 수 없다.
	}
}

public class Exam29 {

	public static void main(String[] args) {
		
		YY y=new YY();
		
		y.y=70; // public으로 선언되어 가능하다.
		// y.b=20; // 객체로 static 변수에 접근할 수 없다.
		YY.b=20; // static 변수는 클래스 이름으로 접근한다.
	}

}

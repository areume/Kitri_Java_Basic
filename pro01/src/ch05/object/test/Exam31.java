package ch05.object.test;

/**
 * @author : 김아름
 * @date   : 2020. 5. 6.
 * @description : 변수 - 지정 예약어 static, final
 */

class II {
	private int x;  			// class field
	private static int value;
	private final double PI=3.141592; // static 함수에서 사용할 수 없다. // 목록에서 s는 static, f는 final
	private static final double RPI=3.141592;
	
	public void sub() {
		int y=20;				// local variable
		// static su=100;       // static으로 지역변수 선언하지 않는다.
		
		System.out.println(x+"\t"+this.x);
		System.out.println(value+"\t"+II.value);
	
		final int R=25;			// 값이 변하지 말아야할 것에 final 선언을 해준다.
		y=77;
		value=88;
		// R=99; -- ERROR! final로 선언한 변수는 변경할 수 없다.
		
		System.out.println(R);
		System.out.println(PI);
	}
	
	public static void fun() {
		int su=100;
		final int abc=77;
		
		System.out.println(su);
		System.out.println(abc);
		//System.out.println(x);  -- ERROR!
		System.out.println(value);
		//System.out.println(PI); -- ERROR!
		
		System.out.println(RPI);
	}
}

public class Exam31 {

	public static void main(String[] args) {

		II ii=new II();
		ii.sub();
		
		II.fun();

	}

}

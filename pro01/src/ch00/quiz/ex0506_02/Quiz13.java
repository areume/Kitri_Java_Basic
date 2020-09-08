package ch00.quiz.ex0506_02;

/**
 * @author : 김아름
 * @date   : 2020. 5. 6.
 * @description : 
 */

class A{
	public int x;
	
	public void f(int x) {		 // 클래스 필드의 값을 설정한다. 
		this.x=x;
	}
	
	public int f(int x, int y) { // 파리미터(지역변수)로 전달된 x, y의 곱을 반환한다.
		return x*y;
	}
}

public class Quiz13 {

	public static void main(String[] args) {
		A a1=new A();
		
		a1.f(10);
		System.out.println(a1.x);
		
		System.out.println(a1.f(20,5));

	}

}

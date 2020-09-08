package ch07.etc;

/**
 * @author : 김아름
 * @date   : 2020. 5. 11.
 * @description : final 메소드
 */

class FinalTest {
	protected final double PI=3.141592;
	protected static final int VALUE=20;
	
	public double getPI() {
		return PI;
	}
	
	public void setPI(double PI) {
		//this.PI=PI;
	}
	
	public void sub() {
		System.out.println("public 함수");
	}
	
	public final void abc() {
		System.out.println("public final 함수");
	}
	
	public static void func() {
		System.out.println("public static 함수");
	}
	
	public static final void xyz() {
		System.out.println("public static final 함수");
	}
}

class Son extends FinalTest {
	
	public void sub() {
		System.out.println("public 함수 재정의 가능");
	}
	
	public static void func() {
		System.out.println("public static 함수 재정의 가능");
	}
	
	//public final void abc() { }
	
	//public static final void xyz() { }
}



public class Exam33 {

	public static void main(String[] args) {
		Son s=new Son();
		
		s.sub();
		Son.func();
		s.abc();
		Son.xyz();

	}

}

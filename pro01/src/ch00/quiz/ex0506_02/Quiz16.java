package ch00.quiz.ex0506_02;

/**
 * @author : 김아름
 * @date   : 2020. 5. 6.
 * @description : 
 */

class Number16 {
	private static int a;
	private int b;
	
	public Number16(int a, int b) {
		Number16.a=a;
		this.b=b;
	}
	
	public static int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public int getC() {
		return getA();
	}
	
	public static int getD() {
		return getA();
	}
}

public class Quiz16 {

	public static void main(String[] args) {
		Number16 samp=new Number16(10,20);
		System.out.println(Number16.getA());
		System.out.println(samp.getB());
		System.out.println(samp.getC());
		System.out.println(Number16.getD());
	}

}

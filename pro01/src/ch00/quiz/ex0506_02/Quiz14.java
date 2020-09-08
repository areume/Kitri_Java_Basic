package ch00.quiz.ex0506_02;

/**
 * @author : 김아름
 * @date   : 2020. 5. 6.
 * @description : 
 */

class Number {
	private int n;
	
	public Number() { }
	
	public Number(int n) {
		this.n=n;
	}
	
	public void plusTen(int n) {
		System.out.println(this.n+=n);
	}
}

public class Quiz14 {

	public static void main(String[] args) {
		Number obj=new Number(5);
		obj.plusTen(20);
	}

}

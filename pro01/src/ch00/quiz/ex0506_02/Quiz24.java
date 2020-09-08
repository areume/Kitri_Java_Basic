package ch00.quiz.ex0506_02;

/**
 * @author : 김아름
 * @date   : 2020. 5. 7.
 * @description : 
 */

class Test24 {
	
	public Test24(int n) {
		System.out.println(n);
	}
	
	public Test24(char ch) {
		System.out.println(ch);
	}
}

public class Quiz24 {

	public static void main(String[] args) {
		Test24 t=new Test24(10);
		Test24 e=new Test24('A');
	}
}

package ch00.quiz.ex0506_02;

/**
 * @author : 김아름
 * @date   : 2020. 5. 7.
 * @description : 
 */

class Test20 {
	// private String str;
	
	public static void change(String str) {
		System.out.println("str : "+str);
	}
}

public class Quiz20 {

	public static void main(String[] args) {
		String msg="안녕하세요";
		Test20.change(msg);
	}

}

package ch00.quiz.ex0506_02;

/**
 * @author : 김아름
 * @date   : 2020. 5. 7.
 * @description : 
 */

class Number17 {
	private int x;
	private static int y;
	
	public static void setY(int y) {
		Number17.y=y;
	}
	
	public static int fun() {
		return y;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public int getX() {
		return x;
	}
}

public class Quiz17 {

	public static void main(String[] args) {
		Number17 num=new Number17();
		
		num.setX(10);
		System.out.println(num.getX());
		
		Number17.setY(20);
		int imsi=Number17.fun();
		System.out.println(imsi);
	}

}

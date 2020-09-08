package ch00.quiz.ex0506_02;

/**
 * @author : 김아름
 * @date   : 2020. 5. 7.
 * @description : 
 */

class Test22 {
	private final double PI=3.141592;
	
	public double getPI() {
		return PI;
	}
	
	public void setPI(double pi) {
		// this.PI=pi;
	}
}

public class Quiz22 {

	public static void main(String[] args) {
		final int x=10;
		// x=20;
		System.out.println("x : "+x);
		
		Test22 a=new Test22();
		//a.setPI(2.4);
		System.out.println(a.getPI());

	}

}

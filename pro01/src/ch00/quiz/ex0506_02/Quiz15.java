package ch00.quiz.ex0506_02;

/**
 * @author : 김아름
 * @date   : 2020. 5. 6.
 * @description : 
 */

class Samp {
	private int id;
	
	public Samp(int id) {
		this.id=id;
	}
	
	public Samp() {
		this(0);
		System.out.println("Hello");
	}
	
	public void disp() {
		System.out.println("id : "+id);
	}
}

public class Quiz15 {

	public static void main(String[] args) {
		Samp samp=new Samp();
		samp.disp();
	}
}

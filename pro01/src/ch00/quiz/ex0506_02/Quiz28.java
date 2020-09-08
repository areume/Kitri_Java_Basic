package ch00.quiz.ex0506_02;

/**
 * @author : 김아름
 * @date   : 2020. 5. 7.
 * @description : 
 */

class Hakjum {
	private int jumsu;
	private char grade;
	
	public Hakjum() {
	}
	
	public Hakjum(int jumsu) {
		this.jumsu=jumsu;
	}
	
	public void getHakjum()	{
		if(jumsu>=90) {
			grade='A';
		}else if(jumsu>=80) {
			grade='B';
		}else if(jumsu>=70) {
			grade='C';
		}else if(jumsu>=60) {
			grade='D';
		}else {
			grade='E';
		}
	}
	
	public void disp() {
		System.out.println("jumsu : "+jumsu+"\tgrade : "+grade);
	}
}

public class Quiz28 {

	public static void main(String[] args) {
		Hakjum h=new Hakjum(88);
		h.getHakjum();
		h.disp();
	}

}

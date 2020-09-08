package ch05.object.test;

/**
 * @author : 김아름
 * @date   : 2020. 4. 29.
 * @description : 
 */

class DD {
	private int x;
	private int y;
	
	public DD() {
		x=0;
		y=0;
	}
	
	public DD(int x) {
		this.x=x;
		y=0;
	}
	
	public DD(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	/* 불가능 하다. 2번째와 파라미터 타입, 개수가 같기 때문
	 public DD(int y) {
	 	x=0;
	 	this.y=y;
	 }	
	 */
	
	public void disp()	 {
		System.out.println(x+"\t"+y);
	}
}

public class Exam24 {

	public static void main(String[] args) {
		
		DD a=new DD();
		DD b=new DD(88);
		DD c=new DD(101,303);
		
		a.disp();
		b.disp();
		c.disp();
	}

}

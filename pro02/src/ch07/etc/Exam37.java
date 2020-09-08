package ch07.etc;

/**
 * @author : 김아름
 * @date   : 2020. 5. 11.
 * @description : 의존 관계
 */

class DD {
	public int x;
	
	public void disp() {
		System.out.println(x);
	}
}

class EE {
	
	public DD sub() {
		DD d=new DD();
		d.x=10;
		return d;
	}
	
	public DD func(DD d) {
		return d;
	}
}

public class Exam37 {

	public static void main(String[] args) {
		
		EE e=new EE();
		DD d=e.sub();
		DD f=e.func(d);
		
		d.disp();
		f.disp();
	}

}

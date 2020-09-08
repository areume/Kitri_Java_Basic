package ch07.etc;

/**
 * @author : 김아름
 * @date   : 2020. 5. 11.
 * @description : 객체를 지역변수 또는 매개변수로 사용. Dependency (의존관계)
 */

class BB {
	public int x;
	
	public void disp() {
		x=10;
		System.out.println(x);
	}
}

class CC {
	private int su;
	
	public void func(BB b) { // 0x100 번지의 객체가 넘어온 것이다.
		b.x=20;
		System.out.println(b.x);
		b.disp();
	}
	
	public void method(BB b) { // 0x100 번지의 객체가 넘어온 것이다.
		b.x=30;
		System.out.println(b.x);
		b.disp();
	}
	
	public void sub() {
		BB b=new BB();
		b.disp();
	}
}

public class Exam35 {

	public static void main(String[] args) {
		BB b=new BB(); // b=0x100
		CC c=new CC(); // c=0x200
		
		c.func(b);     // b=0x100
		c.method(b);
		c.sub();
		
		b=null;
		c=null;

	}

}

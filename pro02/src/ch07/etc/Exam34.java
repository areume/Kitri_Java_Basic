package ch07.etc;

/**
 * @author : 김아름
 * @date   : 2020. 5. 11.
 * @description : 클래스 객체 메모리 영역
 */

class AA {
	private int x,y;
	
	public void func() {
		x=10;
		y=20;
		System.out.println(x+"\t"+y);
	}
}

public class Exam34 {

	public static void main(String[] args) {
		AA a=new AA();
		AA b=a;
		AA c=a;
		AA d=b;
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println();
		
		a.func();
		b.func();
		c.func();
		d.func();
		
		System.out.println("-------------------------------");
		
		b=null;
		//b.func();
		System.out.println();
		
		System.out.println("-------------------------------");
		
		AA x=new AA();
		AA y=x;
		
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println();
		
		x.func();
		y.func();
		
		System.out.println("-------------------------------");
	}

}

package ch05.object.test;

class EE {
	private int x;
	private int y;
	private int z;
	
	private int a;
	
	public EE () {
		x=100;
		y=200;
		z=300;
		a=400;
	}
	
	public EE(int x) {
		/*
		this.x=x;
		y=200;
		z=300;
		a=400;
		*/
		this();		// 자기 자신의 생성자를 찾아간다.
		this.x=x;	// x는 100에서 매개변수로 넘어온 값으로 변경된다.
	}
	
	public EE(int x, int y) {
		/*this.x=x;
		this.y=y;
		z=300;
		a=400; */
		
		/*
		this();
		this.x=x;
		this.y=y;
		*/
		
		this(x);	// 자기 자신의 생성자를 호출할 때는 맨 위에 코드를 작성해야 한다.
		this.y=y;
	}
	
	public void disp() {
		System.out.println(x+"\t"+y+"\t"+z+"\t"+a);
	}
	
}

public class Exam25 {

	public static void main(String[] args) {
		
		EE e=new EE();
		EE f=new EE(10);
		EE g=new EE(77,88);
		
		e.disp();
		f.disp();
		g.disp();

	}

}

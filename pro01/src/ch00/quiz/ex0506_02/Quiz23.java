package ch00.quiz.ex0506_02;

class Test23 {
	private int x,y;
	
	public void setData(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void disp() {
		System.out.println(x+"\t"+y);
	}
}

public class Quiz23 {

	public static void main(String[] args) {
		Test23 a=new Test23();
		a.setData(10,20);
		
		Test23 b=new Test23();
		b.setData(77,88);
		
		a.disp();
		b.disp();
	}
}

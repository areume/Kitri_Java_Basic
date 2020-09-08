package ch00.quizInheritance;

class Parents {
	protected int x,y;
	
	public Parents() { }
	
	public Parents(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

class Son extends Parents {
	private int z;
	
	public Son() { }
	
	public Son(int x, int y, int z) {
		super.x=x;
		super.y=y;
		this.z=z;
	}
	
	public void disp() {
		System.out.println(x+"\t"+y+"\t"+z);
	}
}

public class Quiz22 {

	public static void main(String[] args) {
		Son s=new Son(10,20,30);
		s.disp();
	}

}

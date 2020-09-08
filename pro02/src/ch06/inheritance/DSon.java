package ch06.inheritance;

public class DSon extends DParent {
	
	public DSon() {
		System.out.println("DSon 생성자(1)");
	}
	
	public DSon(int x) {
		super(x);
		System.out.println("DSon 생성자(2)");
	}
	
	public DSon(int x, int y) {
		super(x,y);
		System.out.println("DSon 생성자(3)");
	}
	
	public void showPoint() {
		System.out.println(x+"\t"+y);
	}
}

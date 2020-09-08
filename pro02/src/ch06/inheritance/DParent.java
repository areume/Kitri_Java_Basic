package ch06.inheritance;

public class DParent {
	protected int x;
	protected int y;
	
	public DParent() {
		System.out.println("DParent 생성자(1)");
		this.x=10;
		this.y=20;
	}
	
	public DParent(int x) {
		System.out.println("DParent 생성자(2)");
		this.x=x;
		this.y=20;
	}
	
	public DParent(int x, int y) {
		System.out.println("DParent 생성자(3)");
		this.x=x;
		this.y=y;
	}
}

package ch06.inheritance;

public class AParent {
	// 자식 클래스에 상속될 수 있도록 protected로 선언
	protected int x;
	protected int y;
	
	public void sub() {
		System.out.println("AParent sub Function");
	}
}

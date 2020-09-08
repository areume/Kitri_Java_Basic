package ch06.inheritance;

public class ASon extends AParent{
	private int su;
	private int value;
	
	public void setData(int x, int y, int su, int value) {
		super.x=x;
		super.y=y;
		
		this.su=su;
		this.value=value;
	}
	
	public void disp() {
		// 부모의 private는 상속되지 않는다. 상속받으려면 부모 클래스의 private를 protected로 선언.
		// 상속받은 필드, 메소드에 대해 this. / super. 사용가능하다. >  super. 를 통해 상속받은 것을 나타내준다.
		
		//System.out.println(x+"\t"+this.x);
		System.out.print(super.x+"\t");
		//System.out.println(y+"\t"+this.y);
		System.out.println(super.y);
		
		sub();
		this.sub();
		super.sub();
		
		System.out.println(su+"\t"+value);
		//System.out.println(su+"\t"+this.su);
		//System.out.println(value+"\t"+this.value);
	}
}

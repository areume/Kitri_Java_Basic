package ch05.object.test;

class HH {
	private int x;
	private int y;
	// private int count;
	private static int count;
	
	public void setData(int x, int y) {
		this.x=x;
		this.y=y;		
	}
	
	public void disp() {
		System.out.println(x+"\t"+y);
	}
	
	public void setCount() {
		System.out.println(++count);
	}
}

public class Exam28 {
	public static void main(String[] args) {

		// 객체마다 count 필드를 가지고 있으므로 setCount 결과는 객체별로 호출된 수에 따라 다른 값을 가지게 된다.
		
		HH a=new HH();
		
		a.setData(10,20);
		a.setCount();
		a.disp();
		
		HH b=new HH();
		
		b.setData(30, 40);
		b.setCount();
		b.disp();
		
		HH c=new HH();
		c.setData(50, 60);
		c.setCount();
		c.disp();
		
		// 클래스의 모든 객체를 통틀어 setCount가 몇 번 호출 되었는지 확인하려면 static으로 선언.
	}
	
}

package ch00.quiz.ex0506_01;

class Plus {
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public int getX() {
		return ++x;
	}
	
	public int getY() {
		return ++y;
	}
}

public class Quiz14 {
	
	public static void main(String[] args) {
		Plus p=new Plus();
		
		p.setX(10);
		p.setY(20);
		
		for(int i=0;i<5;i++) {
			System.out.println("x : "+p.getX()+" , y : "+p.getY());
		}
	}
}

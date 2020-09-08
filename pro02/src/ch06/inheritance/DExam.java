package ch06.inheritance;

public class DExam {

	public static void main(String[] args) {
		DSon a=new DSon();
		DSon b=new DSon(10);		// 자기 생성자 찾고 부모 클래스의 생성자 찾음.
		DSon c=new DSon(30,40);
		
		a.showPoint();
		b.showPoint();
		c.showPoint();
	}
}

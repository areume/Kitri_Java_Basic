package ch06.inheritance;

/**
 * @author : 김아름
 * @date   : 2020. 5. 8.
 * @description : Interface - 자신의 객체를 생성할 수 없다. 자식을 담아줄 수는 있다.
 * 
 * 클래스가 클래스를 상속 : extends
 * 인터페이스가 인터페이스를 상속 : extends
 * 클래스가 인터페이스를 상속 : implements
 * 클래스가 인터페이스를 상속하는 경우는 없다.
 * 
 */

interface LParents {
	public int SU=10;	// 내부적으로 static final
	
	public void disp();	// 내부적으로 abstract	
}

class LSon implements LParents {
	private int value;
	
	@Override
	public void disp() {
		System.out.println(SU);
	}
	
	public void output() {
		value=70;
		System.out.println(value);
	}
}

public class LExam {

	public static void main(String[] args) {
		
		// LParents l=new LParents();  -- ERROR! Interface는 자신의 객체를 생성할 수 없다.
		
		LParents p=new LSon();
		p.disp();
		System.out.println(LParents.SU);
		System.out.println(LSon.SU);
		// p.output;  -- ERROR! 부모 클래스에 자식 클래스를 담아준 경우 자식 고유의 메소드는 호출할 수 없다.
		
		LSon s=new LSon();
		s.disp();
		s.output();

	}

}

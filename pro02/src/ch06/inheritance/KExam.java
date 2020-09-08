package ch06.inheritance;

/**
 * @author : 김아름
 * @date   : 2020. 5. 8.
 * @description : 추상(abstract) 클래스 
 * 
 * 추상 함수를 하나라도 가지고 있으면 추상 클래스로 표시해야 한다.
 * 
 */

abstract class KParents {	// 추상 클래스
	protected int x,y;
	
	public void msg() {
		System.out.println("Msg 함수 입니다.");
	}
	
	public abstract void disp();	// 이 함수는 자식 클래스에서 반드시 재정의해야 한다. 추상 함수.	
}

class KSon extends KParents {

	@Override
	public void disp() {
		System.out.println("재정의 했어!");
	}
}

public class KExam {
	public static void main(String[] args) {
		
		//KParents a=new KParents();  -- ERROR! 추상 클래스는 객체발생이 불가능하다.
		KParents b=new KSon();		  // 자식 클래스를 담아주는 것은 가능.
		b.disp();
		
		KSon c=new KSon();
		c.disp();
	}
}

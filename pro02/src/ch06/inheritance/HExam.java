package ch06.inheritance;

/**
 * @author : 김아름
 * @date   : 2020. 5. 7.
 * @description : 
 */

class HParent {
	protected int x;
	protected int y;
	
	public HParent() {}
	
	public HParent(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void yonsan() {
		System.out.println("hap : "+(x+y));
	}
}

class HSon extends HParent {
	
	public HSon() {}
	
	public HSon(int x, int y) {
		super.x=x;
		super.y=y;
	}
	
	public void yonsan() {	// 함수 재정의
		System.out.println("cha : "+(x-y));
	}
	
	public void disp() {
		System.out.println("HI! I AM SON");
	}
}

public class HExam {

	public static void main(String[] args) {
		
		HParent h=new HParent(77,88);
		h.yonsan();
		
		HSon s=new HSon(200,100);
		s.yonsan();
		
		/**********************************/
		
		// HSon a=new HParent(1,2); -- ERROR! 자식은 부모 클래스를 담을 수 없다.
		
		HParent b=new HSon(3,4); 	// 부모는 자식 클래스를 담을 수 있다. upCasting - b는 부모 클래스로 업 캐스팅 되어있다.
		b.yonsan();
		// b.disp();				-- 이 경우, 상속한 것이 아닌, 자식 고유의 필드, 메소드에 접근할 수 없다.
		
		HSon c=(HSon)b;				// 한번 upCasting된 객체는 downCasting 될 수 있다. - 부모 클래스로 업 캐스팅된 b를 자식 클래스로 다시 다운 캐스팅하여 자식 클래스 객체에 복사.
		c.yonsan();
		c.disp();
		
		HSon d=(HSon)new HParent(77,88);	// 업 캐스팅이 안된 객체에 다운 캐스팅 할 수 없다.
		d.yonsan();
		// d.disp();						-- ERROR!
		
		// 업 캐스팅 : 자식 클래스 객체를 부모 클래스로 선언
		// 다운 캐스팅 : 업 캐스팅된 객체를 다시 자식 클래스로 형변환
	}

}

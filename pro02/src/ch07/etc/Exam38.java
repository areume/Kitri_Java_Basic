package ch07.etc;

/**
 * @author : 김아름
 * @date   : 2020. 5. 11.
 * @description : 연관 관계 - 객체를 필드로 사용. (멤버 객체)
 */

class Apple {
	private int su;
	private int value;
	
	public void setData(int su, int value) {
		this.su=su;
		this.value=value;
	}
	
	public int getDate() {
		return su+value;
	}
}

class Banana {
	private Apple apple;				// 4] apple=0x100
	
	public void setData(Apple apple) {	// 3] apple=0x100
		this.apple=apple;
	}
	
	public void disp() {
		System.out.println("결과값 : "+apple.getDate());
	}
}

public class Exam38 {

	public static void main(String[] args) {
		Apple apple=new Apple();		// 1] apple=0x100
		apple.setData(10, 20);
		
		Banana banana=new Banana();
		banana.setData(apple);			// 2] apple=0x100
		banana.disp();
		
		banana=null;
		apple=null;
	}

}

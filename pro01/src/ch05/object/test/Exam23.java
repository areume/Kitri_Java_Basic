package ch05.object.test;

/**
 * @author : 김아름
 * @date   : 2020. 4. 29.
 * @description : 생성자 중복
 * 중복은 생성자명 또는 함수명 이름은 같지만, 파라미터 타입이나 개수가 달라야 한다.
 */

class CC {
	private int x;
	private int y;
	
	public CC(int x, int y) { // 1번 생성자
		this.x=x;
		this.y=y;
	}
	
	public CC() { // 2번 생성자
		x=0;
		y=0;
	}
	
	public void input(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void disp() {
		System.out.println(x+"\t"+y);
	}
}


public class Exam23 {

	public static void main(String[] args) {
		// 생성자로 멤버 변수 설정.
		CC a=new CC(10,20);
		
		// 함수로 멤버 변수 설정.
		CC b=new CC();	  // Error! 클래스 안에 생성자를 정의했으면 디폴트 생성자를 호출할 수 없다. 따라서 객체 생성 시 파라미터를 넘겨주어야 한다. 2번 생성자가 정의되면 정상적으로 실행된다!
		b.input(30,40);   // 생성자가 하나라도 정의되어있으면 정의된 생성자가 우선순위! 생성자 중복 가능하다. 단 파라미터 타입이 다르거나, 개수가 달라야한다. 
		
		a.disp();
		b.disp();
	}

}

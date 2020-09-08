package ch06.inheritance;

/**
 * @author : 김아름
 * @date   : 2020. 5. 7.
 * @description : 함수 오버라이딩 - 자식 클래스에서 부모로부터 상속받은 함수를 재정의 하는 것.
 */

class AA {
	public void aa() {}
	public void bb() {}
	public void cc() {}
	public void dd() {}
	
	public void disp() {
		System.out.println("hahahahaha");
	}
}

class BB extends AA {
	public void disp() {	// 함수 재정의. 선언부는 부모 클래스와 동일하게 작성하고, 실행문을 다르게 작성한다.
		System.out.println("하하하하하하하");
	}
}

public class GExam {

	public static void main(String[] args) {
	
		// 자식 클래스의 객체는 자신의 disp() 함수가 우선순위를 가진다.
		BB b=new BB();
		b.disp();
	}

}

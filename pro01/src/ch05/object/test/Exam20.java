package ch05.object.test;

/**
 * @author : 김아름
 * @date   : 2020. 4. 29.
 * @description : 원래는 하나의 java 파일에 하나의 클래스를 작성. 실습 편의를 위해 하나의 파일에 작성한 것. 실무에서는 절대적으로 나눠야한다.
 * 하나의 java 파일에 public class는 1개만 존재해야 한다. 추가 클래스를 작성하려면 단순히 class로 작성할 것.
 * 
 * 
 * 
 * 
 */

class AA { // this=객체(main에서 생성한 a 객체)
	private int x;
	private int y;
	
	public void input(int x, int y) { // 클래스 변수에 대입하는 경우, 보통 파라미터는 변수명과 같은 이름을 가진다. 파라미터는 지역 변수.
		// x=x;		// 변수에 값이 담기지 않는다. 좌변의 x와 우변의 x는 모두 파라미터 x를 의미한다. 블럭 밖에서 선언된 것보다 블럭 안에서 생성된 변수가 우선순위를 가진다. (변수 생명주기 관련)
		// y=y;
		this.x=x;	// this : 클래스 내부의 포인터. 객체 포인터. 객체 이름이 hong 이라면 this는 hong을 가리킨다.
		this.y=y;	// 생략은 가능하지만 구분해야 하기 때문에 작성해야 한다.
		
		System.out.println(x);		// 지역 변수
		System.out.println(this.x); // 멤버 변수
		System.out.println(y);  	// 지역 변수
		System.out.println(this.y); // 멤버 변수
	}
	
	public void sub() {
		System.out.println(this.x); 		// this 생략가능. 동일한 이름으로 선언된 지역 변수가 존재하지 않는다.
	}
}

public class Exam20 {

	public static void main(String[] args) {
		
		AA a=new AA();
		a.input(10,20);
		

	}

}

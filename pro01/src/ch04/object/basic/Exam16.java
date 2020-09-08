package ch04.object.basic;

/**
 * @author : 김아름
 * @date   : 2020. 4. 29.
 * @description
 * 구현 클래스 :  
 * 실행 클래스 : main 함수를 갖고 있는 클래스.
 * 추상 클래스 : 상속 / 자신의 객체발생이 안됨.
 * Interface : 상속 / 자신의 객체발생이 안됨.
 */

public class Exam16 {	// 실행 클래스

	public static void main(String[] args) {
		
		System.out.println("\nSu Class");
		Su a=new Su();	// 구현 클래스 객체 생성.
		System.out.println(a.x+" "+a.y);	// . 연산자 이용해서 객체의 변수에 접근한다. 객체의 변수는 0으로 초기화 된다.
		
		Su b=new Su();
		b.x=77;								// 객체 변수의 값을 지정.
		b.y=88;
		System.out.println(b.x+" "+b.y);
		
		
		System.out.println("\nPerson Class");
		Person x=new Person(); // 구현 클래스 객체 생성. 객체 변수 초기화 된다.
		//x.name="홍길동";
		//x.age=25;
		//x.ki=157.5f;
		x.input("홍길동", 25, 157.5f);
		// System.out.println(x.name+" "+x.age+" "+x.ki);
		x.disp();	// 객체의 함수에 접근.
		
		Person y=new Person();
		//y.name="펭수";
		//y.age=10;
		//y.ki=210f;
		y.input("펭수", 10, 210f);
		// System.out.println(y.name+" "+y.age+" "+y.ki);
		y.disp();
		
		
		// 중복되는 작업은 구현 클래스의 함수로 만들어서 객체에서 접근해 사용한다. input, disp 함수.
	}

}

package ch05.object.saram;

/**
 * @author : 김아름
 * @date   : 2020. 4. 29.
 * @description : 접근 제한자 예제.
 * 
 * 클래스의 특징 : 은닉화/중복/상속성
 * 
 * public : 공용. . 연산자로 접근 가능. 어디에서나 접근할 수 있다.
 * private : 클래스 밖에서는 사용할 수 없다. . 연산자로 접근할 수 없다. 클래스의 함수를 통해서만 접근할 수 있다. (은닉화)
 * protected : 
 * 
 * 변수는 대부분 private를 사용한다. 함수를 private로 선언하면 외부에서 함수를 사용할 수 없으므로 private로 선언하지 않는다.
 */

public class Exam19 {

	public static void main(String[] args) {
		
		Saram hong=new Saram();
		hong.input("홍길동","구로구","010-1234-1234","123456-1234567");
		hong.output();
		
		Saram cho=new Saram();
		// cho.name="조인성"; name 변수는 클래스 내에서 private 로 선언되었으므로 클래스 밖에서 접근할 수 없다.
		cho.address="이태원";
		cho.phoneNumber="010-1111-2222";
		cho.juminBunho="123456-7654321";
		
		
		
	}

}

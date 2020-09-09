package api13.Exception;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : 예외 전가 (throws) - 인터페이스에서 예외가 발생하면 상속받는 클래스나 호출하는 곳에서 예외를 처리해준다.
 */

class Sub {
	public void func() throws Throwable { // throws 선언은 에러를 처리하지 않고 넘기는 것. // 이 메소드 자체를 실행하는데 문제가 생긴다.
		Throwable ex=new Throwable();
		throw ex; // Exception을 만들어주면 처리하고 가야한다.
		
	}
	
	public void method() throws Throwable {
		System.out.println("Sub의 method 입니다.");
		
		func();	
	}
}

public class Ex11 {

	public static void main(String[] args) throws Throwable {
	
		Sub sub=new Sub();
		sub.method();
		
	}

}







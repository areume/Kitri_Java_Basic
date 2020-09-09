package thread06.Yield;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : yield() 메소드 - 자신의 스레드 실행을 멈추고, 다른 스레드에 양보.
 */

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		
		A a=new A();
		B b=new B();
		
		a.start();
		b.start();
		Thread.sleep(3000);
		
		a.work=false;	// a 객체에 의해 실행되는 스레드를 멈추고, 양보. > b 객체에 의한 스레드만 실행된다.
		Thread.sleep(3000);
		
		a.work=true;
		b.work=false;	// b 객체에 의해 실행되는 스레드를 멈추고, 양보. > a 객체에 의한 스레드만 실행된다.
		Thread.sleep(3000);
		
		a.stop=true;	// stop 필드가 true로 변경되어 스레드가 실행 대기 상태로 전환된다.
		b.stop=true;

	}

}

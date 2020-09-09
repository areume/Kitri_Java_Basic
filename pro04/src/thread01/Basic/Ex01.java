package thread01.Basic;

/**
 * @author : 김아름
 * @date   : 2020. 5. 20.
 * @description : Processor는 하나의 프로그램을 말한다. OS에서 두 개 이상의 프로세서가 실행하면 멀티태스킹이라 한다.
 * 				  (하나의 컴퓨터에서 여러 개의 프로그램이 동시에 실행, 멀티 프로세스)
 * 				  Thread는 하나의 작업이다. 멀티 스레드는 하나의 프로그램 안에서 다수의 작업.
 * 				
 * 				  Start 메소드가 run 메소드를 호출한다. 사용자가 직접 호출하는 것이 아닌 프로그램 로직에서 시스템에 의해 메소드가 실행됨. (callback 함수)
 */

public class Ex01 {

	public static void main(String[] args) { // 부모 스레드 (주 스레드)
		
		Digit01 digit=new Digit01();
		digit.start();		// 콜백 함수
			
		for(int i=1;i<=30;i++) {
			System.out.print("Main"+i+"\t");
			if(i%10==0) System.out.println();
		}
		
		Alphabet01 alpha=new Alphabet01();
		alpha.start();
		
		System.out.println(digit.getName()); // Thread-0
		System.out.println(alpha.getName()); // Thread-1
		
		// main에서 실행되는 스레드의 이름은 main 이다.
		
		// main 스레드/digit 객체로 실행되는 스레드/alpha 객체로 실행되는 스레드/ 총 3개.
	}

}

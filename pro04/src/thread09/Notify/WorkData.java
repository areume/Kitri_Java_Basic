package thread09.Notify;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : 공유 클래스
 */

public class WorkData {
	
	public synchronized void sub1() {	// 동기화 메소드	 출력
		System.out.println(Thread.currentThread().getName()+" : sub1() 작업실행");
		
		notify();
		
		try {
			wait();		// 일시정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void sub2() {	// 동기화 메소드 입력
		System.out.println(Thread.currentThread().getName()+" : sub2() 작업실행");
		
		notify();
		
		try {
			wait();		// 일시정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

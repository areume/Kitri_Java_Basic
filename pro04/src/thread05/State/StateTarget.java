package thread05.State;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : 
 */

public class StateTarget extends Thread {
	
	@Override
	public void run() {	// start() 메소드가 run() 메소드를 호출하기 전까지는 대기 상태. 호출하면 실행 상태. NEW
		
		for(long i=0;i<1000000000;i++) { }	// 실행 RUNNABLE
		
		try {
			sleep(1500);					// 일시정시 TIMED_WAITING
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		for(long i=0;i<1000000000;i++) { }	// 실행  RUNNABLE
		
		// 종료 TERMINATED
	}
	
}

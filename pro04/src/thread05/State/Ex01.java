package thread05.State;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : Thread 상태
 */

public class Ex01 {

	public static void main(String[] args) {
		
		StateTarget target=new StateTarget();
		
		System.out.println("타겟 쓰레드 상태 : "+target.getState());
		target.start();
		
		while(true) {
			
			Thread.State state=target.getState();	// 중첩 클래스. (안배움)
			System.out.println("타겟 쓰레드 상태 : "+state);
			
			if(state==Thread.State.NEW) { // 쓰레드가 아직 start 되지 않은 상태라면 실행. 
			}
			
			if(state==Thread.State.RUNNABLE) { // 쓰레드가 실행 상태라면 실행.
			}
			
			if(state==Thread.State.TIMED_WAITING) { // 쓰레드가 일시정지 상태라면 실행. 	
			}
				
			if(state==Thread.State.TERMINATED) { // 쓰레드가 종료되었아면 실행.
				break;
			}
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}

	}
}

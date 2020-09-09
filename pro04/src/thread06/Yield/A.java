package thread06.Yield;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : 
 */

public class A extends Thread {
	
	public boolean stop=false;	// 스레드를 진행여부를 결정하기 위한 필드
	public boolean work=true;	// 스레드 양보를 제어하기 위한 필드
	
	@Override
	public void run() {
		
		while(!stop) {	// stop=false일 경우 실행.
			
			if(work) {	// work=true일 경우 실행.
				
				try {
					sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("A 작업 내용");
				
			}else { // work=false일 경우 다른 스레드에게 실행을 양보.
				Thread.yield();
			}
		}
		System.out.println("A 종료");
		
	}

}

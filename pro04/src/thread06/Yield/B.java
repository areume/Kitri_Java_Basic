package thread06.Yield;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : 
 */

public class B extends Thread {
	
	public boolean stop=false;
	public boolean work=true;
	
	@Override
	public void run() {
		
		while(!stop) {	// stop=false일 경우 실행.
			
			if(work) {	// work=true일 경우 실행.
				
				try {
					sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("B 작업 내용");
				
			}else { // work=false일 경우 실행.
				Thread.yield();
			}
			
		}
		System.out.println("B 종료");
		
	}

}

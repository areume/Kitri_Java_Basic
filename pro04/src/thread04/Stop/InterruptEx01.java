package thread04.Stop;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : interrupt() 메소드 : 스레드가 실행 대기 또는 실행 상태에 있을 때, interrupt() 메소드가 실행되면
 * 									 스레드가 미래에 일시정지 상태가 되어 InterruptedException이 발생한다.
 * 									 interrupt() 메소드가 호출되었다면 스레드는 interrupted() 메소드는 true를 반환한다.
 */

class SubThread extends Thread {
	
	@Override
	public void run() {

		int count=1;
		
		while (count<=10) {
			System.out.println(count);

			try {
				if(interrupted()==true) {	// interrupted() 메소드는 중단되었는지 확인하는 메소드. (static 함수)
					break;					// interruptedException이 발생한다. 예외 처리해야 한다.
				}
				sleep(500);
				
			}catch(Exception e) {
				System.out.println("자원 종료");
				System.out.println("실행 종료");
				System.exit(1);
			}
			
			
//			try {
//				if(interrupted()) break;
//				sleep(300);
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
			
			
			count++;	
		}
		
	}
	
}

public class InterruptEx01 {

	public static void main(String[] args) {

		SubThread sub=new SubThread();
		sub.start();
		
		for(int i=0;i<=2;i++) {
			
			System.out.println("main "+i);
			
			if(i==1) {
				sub.interrupt(); // i값이 1이 되면 스레드를 중단.
			}
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

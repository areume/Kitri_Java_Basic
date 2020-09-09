package thread01.Basic;

/**
 * @author : 김아름
 * @date   : 2020. 5. 20.
 * @description : 
 */

public class SubThread extends Thread {
	
	public static boolean inputCheck=false;	// 스레드를 계속 진행할지 결정하기 위해 사용하는 static 변수.
	
	@Override
	public void run() {
		
		for(int i=10;i>0;i--) {
			System.out.println(i);
			
			if(inputCheck==true) return;  // inputCheck가 true이면 스레드를 종료한다.
			
			try {
				sleep(1000); 					// 1=1/1000초.
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}      
		}
		System.out.println("데이터가 입력되지 않았습니다.");
		System.exit(0);	// JVM 구동을 멈추는 메소드
	}
	
}

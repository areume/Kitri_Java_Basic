package thread04.Stop;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : stop 메소드 : 갑자기 종료하게 되면서 사용 중인 자원들이 불안전한 상태로 남겨진다. > deprecated
 * 				    클래스 내에 stop 플래그 변수를 선언하여 사용.
 */

class PrintThread extends Thread {
	
	private boolean stop=false;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		
		
		while (!stop) {	// stop이 true가되면 반복문 진행.
			System.out.println("실행 중......"+!stop);

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

//			System.out.println("자원 종료.....");
//			System.out.println("실행 종료.....");

		}
		System.out.println("자원 종료.....");
		System.out.println("실행 종료.....");
	}
	
}

public class StopEx {
	
	public static void main(String[] args) {
		
		PrintThread print=new PrintThread();
		print.start();
		
		for(int i=0;i<=5;i++) {
			
			System.out.println(i);
			
			//if(i==3) print.stop(); 	// deprecated. 갑자기 쓰레드 실행이 종료되면 자원 반납에 문제가 생겨 시스템이 불안정해진다.
			if(i==3) {
				print.setStop(true); 	// stop 플래그 사용. 반복문이 더이상 진행하지 않도록 제어.
				break;
			}
			
			// main 쓰레드에서 i값이 3이 되면 print 객체에 의해 실행되는 쓰레드가 정지된다.
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

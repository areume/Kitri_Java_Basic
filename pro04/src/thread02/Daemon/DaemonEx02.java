package thread02.Daemon;

/**
 * @author : 김아름
 * @date   : 2020. 5. 20.
 * @description : 종속 스레드는 : 일반 쓰레드가 종료되면 종속 스레드는 강제 종료된다.
 */

public class DaemonEx02 {
	public static void main(String[] args) {
		
		AutoSave autoSave=new AutoSave();
		autoSave.setDaemon(true);
		autoSave.start();
		
		try {			
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

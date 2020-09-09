package thread02.Daemon;

/**
 * @author : 김아름
 * @date   : 2020. 5. 20.
 * @description : 
 */

public class AutoSave extends Thread {
	
	public void save() {
		System.out.println("작업을 저장함");
	}
	
	@Override
	public void run() {
		
		while(true) {
			try {
				sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			save();
		}
	}
}

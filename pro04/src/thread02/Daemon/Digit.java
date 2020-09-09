package thread02.Daemon;

/**
 * @author : 김아름
 * @date   : 2020. 5. 20.
 * @description : 
 */

public class Digit extends Thread { 
	
	@Override
	public void run() {
		
		System.out.print(getName()+"\t");
		
		for(int i=1;i<=50;i++) {
			System.out.print(i+"\t");
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
}

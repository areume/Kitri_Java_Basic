package thread02.Daemon;

/**
 * @author : 김아름
 * @date   : 2020. 5. 20.
 * @description : 
 */

public class Alphabet extends Thread {
	
	@Override
	public void run() {
		
		System.out.print(getName()+"\t");
		
		for(char i='A';i<='Z';i++) {
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

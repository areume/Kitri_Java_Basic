package thread08.Synchronized;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : 
 */

public class Family extends Thread {
	
	private Toilet toilet;
	
	public Family() { }
	public Family(Toilet toilet) {
		this.toilet=toilet;
	}
	
	@Override
	public void run() {
		
		toilet.openDoor(Thread.currentThread().getName());
	}
}

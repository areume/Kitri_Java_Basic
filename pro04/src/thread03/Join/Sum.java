package thread03.Join;

/**
 * @author : 김아름
 * @date   : 2020. 5. 20.
 * @description : 
 */

public class Sum extends Thread {
	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			sum+=i;
			
			try {
				sleep(100);
				
				//System.out.println("Sum Class Sum : "+getSum());
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Sum Class Sum : "+getSum());
	}
	
}

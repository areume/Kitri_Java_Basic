package thread10.Notify;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : 
 */

public class Supplier extends Thread {
	private AutoMachine machine;
	
	public Supplier(AutoMachine machine) {
		this.machine=machine;
	}
	
	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+" 음료수 채워넣음");
			machine.setDrink("음료수 NO : "+i);
			
			try {
				sleep(300);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

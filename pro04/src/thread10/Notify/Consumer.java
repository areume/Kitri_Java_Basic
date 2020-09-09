package thread10.Notify;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : 
 */

public class Consumer extends Thread {

	private AutoMachine machine;
	private String name;
	
	public Consumer(AutoMachine machine, String name) {
		this.machine=machine;
		this.name=name;
	}
	
	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(machine.getDrink()+" : "+name+" 꺼내먹음");
			
			try {
				sleep(300);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}

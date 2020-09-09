package thread09.Notify;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : 
 */

public class ChoSupplier extends Thread {

	private WorkData workData;
	
	public ChoSupplier(WorkData workData) {
		this.workData=workData;
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			workData.sub2();
		}
		
	}
}

package thread02.Daemon;

/**
 * @author : 김아름
 * @date   : 2020. 5. 20.
 * @description : 데몬 - 백그라운드로 실행되는 작업,,,? 종속 스레드
 * 
 */

public class DaemonEx01 {

	public static void main(String[] args) {
		
		Alphabet alpha=new Alphabet();
		alpha.setName("알파벳");
		alpha.setDaemon(true); // 중복저장. 주 스레드가 데몬이 될 스레드의 set를 호출 start 전에 받드시 호출.
		alpha.start();
		
		Digit digit=new Digit();
		digit.setName("디지털");
		digit.setDaemon(true);
		digit.start();
		
		System.out.print("메인\t");

		for(int i=101;i<=105;i++) {
			System.out.print(i+"\t");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

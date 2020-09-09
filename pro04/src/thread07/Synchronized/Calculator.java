package thread07.Synchronized;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : 공유 클래스 : Hong과 Cho에서 해당 클래스 객체를 사용한다. / 스레드아니다!!!!!!!!!!!!
 * 
 * setMoney() 메소드를 synchronized로 선언하여 하나의 스레드만 사용하도록 했다. 동시에 여러 개의 스레드가 메소드를 사용할 수 없다. 동기화 메소드
 * 
 * 
 */

public class Calculator {	// 공유 클래스
	
	private int money;

	public int getMoney() {
		return money;
	}

	public synchronized void setMoney(int money) {	// 임의 영역 : 단 하나의 스레드에서만 실행되도록.
		this.money = money;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+money);
	}
}

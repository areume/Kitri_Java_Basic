package thread08.Synchronized;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : 공유 클래스. 여러 개의 Family 객체에서 하나의 Toilet 객체를 사용한다. 
 * 
 * synchronized로 블록 지정.
 */

public class Toilet {

	public void openDoor(String name) {	// 임의 영역 : 단 하나의 스레드에서만 실행되어야 한다.
		
		synchronized (this) {	// 동기화 블럭
			
			System.out.println(name + "가 화장실 사용");

			for (int i = 0; i < 100000; i++) {
				if (i == 100) {
					System.out.println(name + " : 끄응... 시원하다!");
				}
			}

			System.out.println(name + "가 화장실 탈출\n");
			
		}
	}
	
}

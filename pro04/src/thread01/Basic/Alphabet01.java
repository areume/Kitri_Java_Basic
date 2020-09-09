package thread01.Basic;

/**
 * @author : 김아름
 * @date   : 2020. 5. 20.
 * @description : main 메소드에서 start로 호출되는 스레드를 자식 스레드, 부 스레드 라고 한다.
 */

public class Alphabet01 extends Thread {	// 자식 스레드/부 스레드
	@Override
	public void run() {
		for(char i='A';i<='z';i++) {
			System.out.print(i+"\t");
			if(i=='Z') System.out.println();
		}
		System.out.println();
	}
}

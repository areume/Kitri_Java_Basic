package thread01.Basic;

/**
 * @author : 김아름
 * @date   : 2020. 5. 20.
 * @description : 
 */

public class Digit01 extends Thread { 	// 자식 스레드/부 스레드
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.print(i+"\t");		
			if(i%10==0) System.out.println();
		}
		System.out.println();
	}
}

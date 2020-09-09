package thread03.Join;

/**
 * @author : 김아름
 * @date   : 2020. 5. 20.
 * @description : Join
 */

public class JoinEx {

	public static void main(String[] args) {
		
		Sum sum=new Sum();
		sum.start();
		
		try {
			sum.join();  // Sum 클래스가 종료할 때까지 joinEx 스레드가 일시 정지한다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		
		System.out.println("Main Sum : "+sum.getSum());

	}

}

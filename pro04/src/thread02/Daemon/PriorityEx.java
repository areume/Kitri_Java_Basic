package thread02.Daemon;

/**
 * @author : 김아름
 * @date   : 2020. 5. 20.
 * @description : 
 * 				  동시성 (Concurrency) : 하나의 코어에서 멀티 스레드가 번갈아 가면서 실행하는 것.
 * 									   어떤 순서에 의해 동시성으로 실행할 것인가를 결정하는 것은
 * 									   스케줄링(CPU) 이라고 한다.
 * 				  병렬성 (Parallelism) : 멀키 코어에서 멀티 작업을 동시에 실행하는 것.
 */

class Example extends Thread {
	
	@Override
	public void run() {
		
		for(int i=0;i<200000000;i++) {
			
		}
	}
}

public class PriorityEx {

	public static void main(String[] args) throws InterruptedException { // 예외 전가
		
		// 쿼드 코어일 경우 스레드가 병렬성으로 실행될 수 있기 때문에 4개 이하의 스레드를
		// 실행할 경우에는 우선순위 영향을 크게 받지 않는다. 그러므로 4개 이상으로 구현.
		
		for(int i=0;i<=10;i++) {
			Example example=new Example();
			example.setName("thread : "+i);
			
			if(i==5) {
				example.setPriority(Thread.MAX_PRIORITY); 	// 최대 우선순위 부여. 1~10 값을 가지며 숫자가 클수록 우선순위가 높다.
			}
			if(i==3) {
				example.setPriority(Thread.MIN_PRIORITY);
			}
			if(i==10) {
				example.setPriority(5);
			}
			
			example.start();
			Thread.sleep(1000);
			System.out.println(example.getName());
		}

	}

}

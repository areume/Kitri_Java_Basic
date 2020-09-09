package thread10.Notify;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : 
 */

public class Ex01 {

	public static void main(String[] args) {
		
		AutoMachine machine=new AutoMachine();	// 공유 객체
		Supplier gildong=new Supplier(machine);	// 생산자
		
		Consumer cho=new Consumer(machine,"경은");	// 소비자
		Consumer kim=new Consumer(machine,"명관");	// 소비자
		Consumer park=new Consumer(machine,"정인");	// 소비자
		
		gildong.start();	// 스택이 비어있는 상태에서 꺼내게되면 에러가 발생한다. 동기화 처리가 필요하다. 단일 메소드에서도 에레, 동기화 작업 안해도 에러.
		cho.start();
		kim.start();
		park.start();
	}

}

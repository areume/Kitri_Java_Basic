package api02.Class;

/**
 * @author : 김아름
 * @date   : 2020. 5. 12.
 * @description : 동적 객체 생성 - 복수개
 */

public class ActionMain {

	public static void main(String[] args) throws Exception {
		ReceiveAction receive=new ReceiveAction();
		receive.execute();
		
		SendAction send=new SendAction();
		send.execute();
		
		Action action=new ReceiveAction();
		action.execute();
		
		action=new SendAction();
		action.execute();
		
		System.out.println("=============");
		
		// 동적 객체 생성
		Class<?> cls=Class.forName("api02.Class.ReceiveAction");
		ReceiveAction act1=(ReceiveAction)cls.getDeclaredConstructor().newInstance();
		act1.execute();
		System.out.println(act1); // 오버라이딩된 toString() 메소드가 없므로 주소값이 출력된다.
		
		System.out.println("=============");
		
		// 복수개 처리. 지금은 배열이지만 나중에는 컬렉션 사용한다.
		String[] classArray=new String[] {"api02.Class.ReceiveAction","api02.Class.SendAction"};
		
		for(int i=0;i<classArray.length;i++) {
			Class<?> cla=Class.forName(classArray[i]);
			Action a=(Action)cla.getDeclaredConstructor().newInstance();		// 넘어오는 모든 클래스를 받아주기 위해 상위 인터페이스인 Action으로 받아준다.
			a.execute();
		}
	}

}

package thread10.Notify;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : 공유 클래스
 */

import java.util.Stack;

public class AutoMachine {

	private Stack<String> store=new Stack<String>();
	
	public synchronized void setDrink(String drink) {
		
		if(!store.isEmpty()) {		// 스택이 비어있을 않을 경우 기다려서 깨운다?
			notify();
		}
		
		store.push(drink);
	}
	
	public synchronized String getDrink() {
		
		while(store.isEmpty()) {	// 스택이 비어있을 동안은 음료수를 꺼내지 말고 기다려라.
			
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		return store.pop();
	}
}

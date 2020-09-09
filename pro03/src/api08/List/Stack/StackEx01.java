package api08.List.Stack;

/**
 * @author : 김아름
 * @date   : 2020. 5. 14.
 * @description : Stack
 */

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>(); // First In Last Out
		stack.push(10);		// 반환형 : push 한 값.
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println(stack.pop());	// 40
		System.out.println(stack.pop());	// 30
		System.out.println(stack.pop());	// 20
		System.out.println(stack.pop());	// 10
		//System.out.println(stack.pop());	//EmptyStackException
		
		Stack<String> strStack=new Stack<String>();
		strStack.push("청포도");
		strStack.push("오렌지");
		strStack.push("바나나");
		strStack.push("복숭아");
		
		while(!strStack.isEmpty()) {
			System.out.println(strStack.pop());
		}
		//System.out.println(strStack.pop()); // ERROR! - EmptyStackException
	}

}

package api02.Class;

/**
 * @author : 김아름
 * @date   : 2020. 5. 12.
 * @description : 
 */

public class ReceiveAction implements Action {
	
	@Override
	public void execute() {
		System.out.println("데이터를 받습니다.");
	}
}

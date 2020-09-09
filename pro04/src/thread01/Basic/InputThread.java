package thread01.Basic;

import javax.swing.JOptionPane;

/**
 * @author : 김아름
 * @date   : 2020. 5. 20.
 * @description : 
 */

public class InputThread extends Thread {
	
	@Override
	public void run() {
		String input=JOptionPane.showInputDialog("10초 안에 값을 입력하세요.");	// 매개변수 값이 적힌 판넬을 생성. 실행하면 창이 띄워진다.
		
		if(input!=null) SubThread.inputCheck=true;	// 창을 통해 input 변수에 값이 들어왔는지 확인. 값이 들어왔으면 inputCheck 값을 true.
		
		System.out.println("입력하신 값은 "+input+" 입니다.");
	}

}

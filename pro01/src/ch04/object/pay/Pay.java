package ch04.object.pay;

/**
 * @author : 김아름
 * @date   : 2020. 4. 29.
 * @description : Pay 구현 클래스
 */

public class Pay {
	
	public String name;
	public int bonbong;
	
	public int tex;
	public int silsu;
	
	public void input(String n, int b) {
		name=n;
		bonbong=b;
	}
	
	public void yonsan() {
		tex=(int)(bonbong*0.045+0.5);
		silsu=bonbong-tex;
	}
	
	public void output() {
		System.out.print(name+"\t"+bonbong+"\t"+tex+"\t"+silsu+"\n");
	}
}

// 하나의 함수는 특정할 수 있는 하나의 기능을 가진다. 하나의 함수에서 모든 기능을 구현하지 않고, 하나의 함수에서 한 가지의 기능만 동작하도록 구현한다. (기능이 명확하도록)
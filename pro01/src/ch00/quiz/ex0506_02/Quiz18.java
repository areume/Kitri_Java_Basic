package ch00.quiz.ex0506_02;

/**
 * @author : 김아름
 * @date   : 2020. 5. 7.
 * @description : 
 */

class Test {
	private int x, y;
	private static int z;
	
	public void getData(int x, int y, int z) {
		this.x=x;
		this.y=y;
		Test.z=z;
	}
	
	public void disp() {
		System.out.println(x+"\t"+y+"\t"+z);
	}
}

public class Quiz18 {

	public static void main(String[] args) {
		Test test=new Test();
		test.getData(10, 20, 30);
		test.disp();
	}

}

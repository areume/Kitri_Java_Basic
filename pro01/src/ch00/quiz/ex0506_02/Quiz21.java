package ch00.quiz.ex0506_02;

/**
 * @author : 김아름
 * @date   : 2020. 5. 7.
 * @description : 
 */

class Test21 {
	private int x,y;
	
	public Test21() {
	}
	
	public Test21(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void disp() {
		System.out.println(x+"\t"+y);
	}
}

public class Quiz21 {

	public static void main(String[] args) {
		Test21[] array=new Test21[3];
		
		array[0]=new Test21(10,20);
		array[1]=new Test21(50,60);
		array[2]=new Test21(80,90);
		
		for(int i=0;i<array.length;i++) {
			array[i].disp();
		}

	}

}

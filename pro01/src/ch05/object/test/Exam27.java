package ch05.object.test;

/**
 * @author : 김아름
 * @date   : 2020. 5. 6.
 * @description : 클래스 배열. 자주 사용하지 않는다. 컬렉션을 더 많이 사용한다.
 */

class GG {
	private int x;
	private int y;
	
	public GG() {
		// 매개변수가 포함된 생성자를 하나라도 생성한 경우, 디폴트 생성자를 반드시 선언해준다. 굳이 초기화를 진행하지 않아도 된다.
	}
	
	public GG(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void disp()	{
		System.out.println(x+"\t"+y);
	}
	
}

public class Exam27 {

	public static void main(String[] args) {

		GG[] array=new GG[6];
		array[0]=new GG(10,20);
		array[1]=new GG(30,40);
		array[2]=new GG(50,60);
		array[3]=new GG(70,80);
		array[4]=new GG(90,100);
		array[5]=new GG();
		
		for(int i=0;i<array.length;i++) {
			array[i].disp();
		}
	}

}

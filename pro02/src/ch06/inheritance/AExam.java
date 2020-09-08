package ch06.inheritance;

/**
 * @author : 김아름
 * @date   : 2020. 5. 7.
 * @description : 상속.
 * 
 * - 클래스의 3대 특징 : 은닉화, 중복성, 상속
 * 
 * - 자바에서 만들어진 모든 클래스는 자동으로 Object 클래스를 상속한다.
 * 
 */

public class AExam {

	public static void main(String[] args) {
		AParent ap=new AParent();
		ap.sub();
		System.out.println("===============");
		
		ASon as=new ASon();
		as.setData(10,20,30,40);
		as.disp();
	}
}
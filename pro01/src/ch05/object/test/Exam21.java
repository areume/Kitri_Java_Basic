package ch05.object.test;

/**
 * @author : 김아름
 * @date   : 2020. 4. 29.
 * @description : 생성자
 */

class BB {
	private int x;
	private int y;
	private int z;
	
	public BB(int x, int y, int z) {	// 생성자. 사용자가 따로 정의하지 않으면 컴파일러에서 디폴트 생성자를 호출한다. 리턴이 없고, 클래스이름과 같은 이름을 가진다.
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public void disp() {	// 함수
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(this.z);
	}
}

public class Exam21 {

	public static void main(String[] args) {
		BB b=new BB(10,20,30);	// 객체를 생성할 때 데이터를 던져준다.
		b.disp();
	}

}

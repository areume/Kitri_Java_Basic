package ch07.etc;

/**
 * @author : 김아름
 * @date   : 2020. 5. 11.
 * @description : 싱글톤 (Singleton) static 선언을 생성자에 추가. 한번에 하나만 가질수 있는 클래스.
 */

class Singleton {
	private static Singleton singleton=new Singleton();
	
	public void data() {
		System.out.println("싱글톤 함수");
	}
	
	public static Singleton getInstance() {
		return singleton;	// private static으로 생성한 singleton이 가진 주소값이 반환된다.
	}
}

public class Exam40 {

	public static void main(String[] args) {
		Singleton a=new Singleton();
		Singleton b=new Singleton();
		Singleton c=b;
		
		if(a==b) {
			System.out.println("T");
		}else {
			System.out.println("F");
		}
		
		if(b==c) {
			System.out.println("T");
		}else {
			System.out.println("F");
		}
		
		System.out.println("============================");

		Singleton x=Singleton.getInstance();
		x.data();
		
		Singleton y=Singleton.getInstance();
		y.data();
		
		if(x==y) {
			System.out.println("T");
		}else {
			System.out.println("F");
		}
	}

}

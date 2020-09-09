package thread07.Synchronized;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : 
 */

public class Ex01 {

	public static void main(String[] args) {
		
		Calculator c=new Calculator(); // 공유 객체. 한 객체를 다수의 클래스 객체에서 사용한다.
		
		Hong hong=new Hong();
		hong.setCalculator(c);
		hong.start();
		
		Cho cho=new Cho();
		cho.setCalculator(c);
		cho.start();

	}

}

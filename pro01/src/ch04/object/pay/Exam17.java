package ch04.object.pay;

/**
 * @author : 김아름
 * @date   : 2020. 4. 29.
 * @description : 연봉을 계산하는 프로그램
 */

public class Exam17 {

	public static void main(String[] args) {

		Pay hong=new Pay();
		hong.input("홍길동",2000000);
		hong.yonsan();
		hong.output();
		
		Pay cho=new Pay();
		cho.input("조인성",2500000);
		cho.yonsan();
		cho.output();
	}

}

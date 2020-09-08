package ch01.dataType;

/**
 * @author : 김아름
 * @date   : 2020. 4. 27.
 * @description : 연산자 우선순위
 *	1) 최우선 연산자 : . [] ()
 *	2) 단항 연산자 : ! ~ +/- ++/--(전위형) (cast) 또는 (자료형)
 *	3) 산술 연산자 : *, /, %, +, -
 *	4) 시프트 연산자 : << >> >>>
 *	5) 비교 연산자 : < > <= >= == !=
 *	6) 논리 연산자 : & ^ | && ||
 *	7) 삼항 연산자 : 조건식? 참:거짓
 *	8) 대입 연산자 : = *= /= %= += -=
 *	9) ++/--(후위형)
 * 10) 순차 연산자 : ,
 */

public class Exam02 {

	public static void main(String[] args) {
		
		// !, ~ 부정 연산자
		boolean a=false;
		boolean b=!a;		// 일반 부정
		System.out.println(a+"\t"+b);
		
		int c=~10;			// 이진 부정 (0000 1010 > 11110101 > -11)
		System.out.println("c : "+c);
		
		int d=~-15;			// 이진 부정 (1111 0001 > 0000 1110 > 14)
		System.out.println("d : "+d);
		
		int cc=~24;
		int dd=~-30;
		System.out.println("cc : "+cc);
		System.out.println("dd : "+dd);
		
		// +, - 출력 시 부호를 바꿔준다. 원본 데이터에는 영향을 주지 않는다.
		int x=100;
		int y=200;
		System.out.println(x+"\t"+y);
		System.out.println(-x+"\t"+y);
		System.out.println(x+"\t"+-y);
	}

}

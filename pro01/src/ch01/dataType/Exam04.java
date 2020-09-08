package ch01.dataType;

/**
 * @author : 김아름
 * @date   : 2020. 4. 27.
 * @description : 3) 산술 연산자 : *, /, %, +, -
 *				  5) 비교 연산자 : < > <= >= == !=
 *				  6) 논리 연산자 : & ^ | && ||
 *				  7) 삼항 연산자 : 조건식? 참:거짓
 *				  8) 대입 연산자 : = *= /= %= += -= &= ^=
 *				 10) 순차 연산자 : ,
 */

public class Exam04 {
	
	public static void main(String[] args) {
		
		// 산술 연산자
		int num1=10;
		int num2=20;
		int sum=num1+num2;
		int cha=num1-num2;
		int mul=num1*num2;
		float div=(float)num1/num2;
		int rest=num1/num2;
		
		System.out.println("산술 연산자");
		System.out.println("합 : "+sum);
		System.out.println("차 : "+cha);
		System.out.println("곱 : "+mul);
		System.out.println("나누기 : "+div);
		System.out.println("나머지 : "+rest+"\n\n");
		
		
		// 비교 연산자
		int a=10;
		int b=20;
		
		boolean c=a>b;	// false
		boolean d=a<b;	// true
		boolean e=a>=b;	// false
		boolean f=a<=b; // true
		boolean g=a==b; // false
		boolean h=a!=b; // true
		System.out.println("관계 연산자");
		System.out.println(c+" "+d+" "+e+" "+f+" "+g+" "+h+"\n\n");
		
		
		// 논리 연산자
		byte i=10;	// 0000 1010
		byte j=2;	// 0000 0010
		System.out.println("논리 연산자");
		System.out.println("i & j "+(i&j));	// 0000 0010 : 모두 참이여야 참. (2)
		System.out.println("i | j "+(i|j));	// 0000 1010 : 한쪽이 참이면 참. (10)
		System.out.println("i ^ j "+(i^j));  // 0000 1000 : 같은 경우 0, 다른 경우 1. (8)
		System.out.println("\n\n");
		
		
		int su=15;
		boolean r=su > 10 && su <20;
		boolean rr=su==10 || su==15;
		System.out.println("& : "+r);
		System.out.println("| : "+rr);
		System.out.println("\n\n");
		
		// 삼항 연산자
		int q=10;
		int w=20;
		int value=(q!=w)?q:w;		// q와 w가 다르면 참, q / q와 w가 같으면 거짓, w
		System.out.println("삼항 연산자");
		System.out.println(value);
		System.out.println(q==30?"참":"거짓");
		System.out.println("\n\n");
		
		
		// 대입 연산자
		System.out.println("대입 연산자");
		q += 10;	// q=q+10;
		System.out.println(q);
		q *= 200;	// q=q*100;
		System.out.println(q);
		System.out.println("\n\n");
		
		
		// 순차 연산자
		int ii=10, jj=20, kk=30;
		System.out.println("순차 연산자");
		System.out.println(ii+"\t"+jj+"\t"+kk);
		
	}	
}

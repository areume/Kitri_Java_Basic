package ch01.dataType;

/**
 * @author : 김아름
 * @date   : 2020. 4. 27.
 * @description : 2) 단항 연산자 : ! ~ +/- ++/-- (cast) 또는 (자료형)
 */

public class Exam03 {

	public static void main(String[] args) {
		
		// ++, --
		int x=10;
		++x;
		x++;
		System.out.println(x);
		
		--x;
		x--;
		System.out.println(x);

		int y=10;
		int z=++y;
		System.out.println(y+"\t"+z);
		
		int a=10;
		int b=a++;
		System.out.println(a+"\t"+b);
		
		int i=10;
		int j=20;
		int k= ++i + ++j;	// i=11, j=21, k=32.
		int m= ++i + j++;	// i=12, j=22, m=33 / j는 21을 대입한 후 증가.
		int n= i++ + j++;	// i=13, j=23, n=34 / i, j 는 12, 22를 대입한 후 증가.
		
		System.out.println(k+"\t"+m+"\t"+n);
		
		// CAST(자료형) 연산자
		System.out.println("CAST(자료형) 연산자");
		
		byte su=10;
		short value=su;		// byte, short, int, long
		System.out.println("value : "+value);
		
		int r=77;
		byte rr=(byte)r;	// 다른 자료형에 대입하는 경우 변경하려는 자료형을 미리 알려준다.
		System.out.println("rr : "+rr);
		
		float su1=55.5f;
		int su2=66;
		
		float result1=su1+su2;
		System.out.println(result1);
		int result2=(int)su1+su2;
		System.out.println(result2);
		
		int w=10;
		int q=3;
		float result3=w/q;
		System.out.println(result3);
		float result4=(float)w/q;
		System.out.println(result4);
		
		System.out.println("W : "+w);		// 문자열+정수=문자열
		System.out.println(w+q);			// 10+3=13 출력
		System.out.println(w+" "+q);    	// 문자열이 더해졌으므로 반환값도 문자열
		System.out.println("합계 : "+w+q);	// 문자열이 더해졌으므로 반환값도 문자열, 산술연산되지 않는다.
		System.out.println("합계 : "+(w+q));	// 산술연산에 괄호로 우선순위를 부여, 합계가 출력된다.
		
		int p=10;
		System.out.println("p : "+p++);     // p를 출력한 후에 증가된다.
		System.out.println(p);				
		
		System.out.println("p : "+ ++p);	// p가 증가한 후 출력된다.
		System.out.println(p);
		
	}

}

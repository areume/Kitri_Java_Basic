package ch05.object.test;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author : 김아름
 * @date   : 2020. 5. 6.
 * @description : 
 */

class ZZ {
	private String name;
	private int don;
	private static float iyul;
	
	public ZZ() {
		
	}
	
	public ZZ(String name, int don, float iyul) {
		this.name=name;
		this.don=don;
		ZZ.iyul=iyul;
	}
	
	public void disp() {
		System.out.println(name+"\t"+don+"\t"+iyul);
	}
	
	public static void output() {
		// static 함수는 static 변수만 사용가능하다.
		// System.out.println(name); -- ERROR!
		// System.out.println(don);	 -- ERROR!
		System.out.println(iyul);	 
	}
}

// 지역변수를 static 으로 선언할 수 없다. 클래스의 필드로만 가능하다.

public class Exam30 {

	public static void main(String[] args) {
		
		ZZ z=new ZZ("홍길동",100000,0.07f);
		z.disp();
		
		// static 메소드를 사용할 경우에도 클래스 이름으로 접근한다
		ZZ.output();
		
		ZZ a=new ZZ("홍길동",85000,0.09f);
		a.disp();
		
		ZZ.output();
		
		
		// static으로 선언된 필드는 클래스명으로 접근.
		double pi=Math.PI;
		System.out.println(pi);
		
		PrintStream out=System.out; // System 클래스의 out 메소드의 반환형은 PrintStream 클래스형
		out.println(10);
		
		InputStream is=System.in;
		Scanner sc=new Scanner(is); // in은 System 클래스의 static 변수
		
		int su=Math.abs(-20);
		System.out.println(su);
		
		
	}

} // 프로그램 종료

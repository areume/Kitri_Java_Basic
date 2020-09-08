package ch02.control;

import java.util.Scanner;

/**
 * @author : 김아름
 * @date   : 2020. 4. 28.
 * @description : Scanner
 */

public class Exam11 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);	// System.in 은 키보드 입력을 의미한다.
		
		System.out.print("문자열 입력 : ");		
		String a=sc.next();		// 모든 입력을 문자열로 저장한다.
		
		System.out.print("문자 입력 : ");
		String str=sc.next();
		char ch=str.charAt(0);
		
		// 연산하기 위해서는 숫자형으로 변경하여 읽어야 한다.
		System.out.print("정수 입력 : ");
		int x=sc.nextInt();
		
		System.out.print("실수 입력 : ");
		float y=sc.nextFloat();
		
		System.out.println();
		System.out.println(a);
		System.out.println(ch);
		System.out.println(++x);
		System.out.println(++y);
		
		
		sc.close();
		
		// 영문, 숫자는 알아서 들어간다.
		// 한글은 커서를 입력위치에 위치시키고 입력해야 한다.
		
	}

}

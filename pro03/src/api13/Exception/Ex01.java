package api13.Exception;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : Exception - 예외 처리, 예외 전가, 예외 발생
 * 
 */

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x=sc.nextInt();
		
		System.out.print("정수를 입력하세요 : ");
		int y=sc.nextInt();
		
		int div=x/y;	
		System.out.println("나누기 결과 : "+div);
			
		/*
		try {
			int div=x/y;
			
			System.out.println("나누기 결과 : "+div);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}*/
			
		
		sc.close();

	}

}

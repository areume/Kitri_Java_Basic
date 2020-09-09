package api13.Exception;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : 함수 하나에 try catch 하나.
 * 
 */

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		
		
		try {
			
			System.out.print("정수를 입력하세요 : ");
			int x=sc.nextInt();
			
			System.out.print("정수를 입력하세요 : ");
			int y=sc.nextInt();
			
			int div=x/y;
			
			System.out.println("나누기 결과 : "+div);
			
		} catch (Exception e) {
			System.out.print("에러 발생 : ");		// 사용자를 위해 에러가 발생했음을 알림.
			System.out.println(e.getMessage());	// 개발자를 위해서 에러 내용을 간단하게 표시
			e.printStackTrace(); 				// 에러 발생 코드를 추적한 내용을 모두 출력한다.
		} 
			
		
		sc.close();

	}

}

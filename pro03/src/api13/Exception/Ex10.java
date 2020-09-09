package api13.Exception;

import java.util.Scanner;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : 프로그램 로직상 필요할 때 에러를 발생해주기. 예외 발생
 */

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try {
		System.out.print("수를 입력 (숫자 5는 입력불가) : ");
		int su=sc.nextInt();
		
		if (su==5) {
			NumberFormatException ex=new NumberFormatException();
			
			throw ex;	// 에러를 만들어 준다.
		}
		
		
		System.out.println(su);
		} catch(NumberFormatException e) {
			System.out.println("5는 입력불가 합니다.");
		}finally {
			sc.close();
		}


	}

}

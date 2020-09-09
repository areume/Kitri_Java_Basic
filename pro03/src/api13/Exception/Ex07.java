package api13.Exception;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : 에러 2개를 동시에 처리 - 발생한 에러에 따라서 맞는 catch문을 찾아가서 처리된다.
 * 
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		
		
		try {
			
			System.out.print("정수를 입력하세요 : ");
			int x=sc.nextInt();
			
			System.out.print("정수를 입력하세요 : ");
			int y=sc.nextInt();
			
			int div=x/y;
			
			System.out.println("나누기 결과 : "+div);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println("정수형만 입력 가능합니다.");
		}
			
		
		sc.close();

	}

}

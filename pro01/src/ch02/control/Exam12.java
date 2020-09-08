package ch02.control;

/**
 * @author : 김아름
 * @date   : 2020. 4. 28.
 * @description : 숫자를 입력받아 해당 구구단을 출력. (계속 입력받을지 체크, N 입력되면 중지)
 */

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char ch=0;
		
		do {
			System.out.print("\n구구단을 입력하세요 : ");
			
			int dan=sc.nextInt();	
			for(int i=1;i<=9;i++) {
				System.out.println(dan+" * "+i+ " = "+dan*i);
			}
			
			System.out.print("\n계속하려면 아무키나 입력하세요.(N은 중단) : ");
			String str=sc.next();
			ch=str.charAt(0);
			
		}while(ch!='N');
		
		System.out.println("종료되었습니다!");
		sc.close();
	}

}

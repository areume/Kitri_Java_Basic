package io06.Quiz.Exception;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		
		Scanner sc=null;
		long num;
		
		try {
			sc=new Scanner(System.in);
			System.out.print("수를 입력하세요 : ");
			num=sc.nextLong();
			
			if(num/1000000000==0) {	// (int)(Math.log10(num)+1)==10 (자료형이 int인 경우만 가능하다.)
				NumberFormatException ex=new NumberFormatException();
				throw ex;
			}
			
			System.out.println("입력하신 수는 "+num+" 입니다.");
			
		} catch(Exception e) {
			System.out.println("에러발생! 정확히 10자리만 입력 가능합니다!");
			
		} finally {
			try {
				if(sc!=null) sc.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}

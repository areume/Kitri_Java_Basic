package api06.Quiz;

import java.util.Scanner;

public class Quiz27 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String num1="";
		String num2="";

		System.out.print("수를 입력하세요 : ");
		num1=sc.next();
		System.out.print("수를 입력하세요 : ");
		num2=sc.next();
		
		int sum=Integer.parseInt(num1)+Integer.parseInt(num2);
		System.out.println("Sum : "+sum);
		
		sc.close();
	}

}

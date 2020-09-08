package ch00.quiz.ex0506_02;

import java.util.Scanner;

/**
 * @author : 김아름
 * @date   : 2020. 5. 7.
 * @description : 
 */

class Yonsan {
	private int su1;
	private int su2;
	private char oper;
	private int resultInt;
	private float resultFloat;
	
	private Scanner sc;
	
	public void input() {
		
		sc=new Scanner(System.in);
		String str;
		
		System.out.print("수 입력 : ");
		su1=sc.nextInt();
		System.out.print("연산자 입력 : ");
		str=sc.next();
		oper=str.charAt(0);
		System.out.print("수 입력 : ");
		su2=sc.nextInt();
	}
	
	public void yonsan() {
		
		switch(oper) {
		case '+':
			resultInt=su1+su2;
			break;
		case '-':
			resultInt=su1-su2;
			break;
		case '*':
			resultInt=su1*su2;
			break;
		case '/':
			resultFloat=(float)su1/su2;
			break;
		case '%':
			resultInt=su1%su2;
			break;
		default:
			this.input();
		}
	}

	public void disp() {
		if(oper=='/') {
			System.out.println(su1+" "+oper+" "+su2+" = "+resultFloat);
		}else {
			System.out.println(su1+" "+oper+" "+su2+" = "+resultInt);
		}
	}
}

public class Quiz29 {

	public static void main(String[] args) {
		Yonsan y=new Yonsan();
		
		y.input();
		y.yonsan();
		y.disp();
	}

}

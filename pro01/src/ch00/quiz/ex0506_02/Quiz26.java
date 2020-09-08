package ch00.quiz.ex0506_02;

import java.util.Scanner;

/**
 * @author : 김아름
 * @date   : 2020. 5. 7.
 * @description : 
 */

class Phone {
	private String name;
	private String tel;
	
	private Scanner sc;
	
	public Phone() {
		sc=new Scanner(System.in);
		
		System.out.print("이름 입력 >> ");
		this.name=sc.next();
		System.out.print("전화번호 입력 >> ");
		this.tel=sc.next();	
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
}

public class Quiz26 {

	public static void main(String[] args) {
		Phone kim=new Phone();
		Phone lee=new Phone();
		
		System.out.println(kim.getName()+"\t"+kim.getTel());
		System.out.println(lee.getName()+"\t"+lee.getTel());
	}

}

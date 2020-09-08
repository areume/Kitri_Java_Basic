package ch00.quiz.ex0506_01;

import java.util.Scanner;

/**
 * @author : 김아름
 * @date   : 2020. 5. 6.
 * @description : 
 */

class Employee {
	private String name;
	private int empno;
	private int age;
	private String job;
	private String dept;
	private String grade;
	
	public void input() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("이름 : ");
		this.name=scanner.next();
		
		System.out.print("사번 : ");
		this.empno=scanner.nextInt();
		
		System.out.print("나이 : ");
		this.age=scanner.nextInt();
		
		System.out.print("직함 : ");
		this.job=scanner.next();
		
		System.out.print("근무부서 : ");
		this.dept=scanner.next();
		
		System.out.print("인사등급 : ");
		this.grade=scanner.next();
		
		scanner.close();
	}
	
	public void output() {
		System.out.println(name+" "+empno+" "+age+" "+job+" "+dept+" "+grade);
	}
}

public class Quiz11 {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.input();
		emp.output();
	}

}

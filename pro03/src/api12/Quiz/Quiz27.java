package api12.Quiz;

import java.util.HashMap;
import java.util.Scanner;

class Student {
	private String name;
	private String deptName;
	private String number;
	private Float average;
	
	private Scanner sc;
	
	
	public Student() { 
		sc=new Scanner(System.in);
		
		System.out.print("이름 : ");
		this.name=sc.next();
		System.out.print("학과 : ");
		this.deptName=sc.next();
		System.out.print("학번 : ");
		this.number=sc.next();
		System.out.print("학점평균 : ");
		this.average=sc.nextFloat();
		System.out.println();
	}
	
	public void disp() {
		System.out.println(name+"\t"+deptName+"\t"+number+"\t"+average);
	}
	
	public String getNumber() {
		return number;
	}
}

public class Quiz27 {

	public static void main(String[] args) {
		
		Student kim=new Student();
		Student park=new Student();
		Student lee=new Student();
		Student cho=new Student();
		Student hong=new Student();
		
		HashMap<String,Student> map=new HashMap<String,Student>();
		map.put(kim.getNumber(),kim);
		map.put(park.getNumber(),park);
		map.put(lee.getNumber(),lee);
		map.put(cho.getNumber(),cho);
		map.put(hong.getNumber(),hong);
		
		Scanner sc=new Scanner(System.in);		
		System.out.print("검색할 학번을 입력하세요 : ");
		String num=sc.next();
		map.get(num).disp();
		
		sc.close();	
	}

}

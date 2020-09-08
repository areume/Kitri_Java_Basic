package ch02.control;

/**
 * @author : 김아름
 * @date   : 2020. 4. 28.
 * @description : 제어문 
 * 				  1) 조건문 (if, if~else, if~else if~else, switch~case)
 * 				  2) 반복문 (for, 다중 for, while, do~while)
 */

public class Exam05 {

	public static void main(String[] args) {
		
		// while, do while 문을 자바에서 더 많이 사용하단. 수치반복인 for문은 잘 사용하지 않는다.
		// java는 행 단위로 데이터를 읽어오기 때문이다.
		
		// if문은 해당하는 조건에 맞는 블록을 실행한 후에 블록을 완전히 탈출한다.
		
		// if
		int x=20;
		
		if(x > 10) {
			System.out.println("x는 10보다 큰 수");
		}
		
		// if~else
		int y=30;
		
		if(y > 0 && y < 100) {
			y += 200;
		}else {
			y *= 200;
		}
		System.out.println("y : "+y);
		
		// if~else if~else
		int score=90;
		
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		System.out.println();
		
		// 중첩 사용
		String grade="";
	
		if(score >= 90) {
			if(score >= 97) {
				grade="A+";
			}else if(score >= 94 ) {
				grade="A0";
			}else if(score >= 90) {
				grade="A-";
			}
		}else if(score >= 80) {
			if(score >= 87) {
				grade="B+";
			}else if(score >= 84 ) {
				grade="B0";
			}else if(score >= 80) {
				grade="B-";
			}
		}
		System.out.println(grade);
		
		// switch 문은 수식을 사용할 수 없어서 한계가 있다.
		// 수치연산, 수의 범위는 if문을 사용한다.
		
		
		
		
		
		
		
		
		
	}

}

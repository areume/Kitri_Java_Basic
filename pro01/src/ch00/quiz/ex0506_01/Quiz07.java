package ch00.quiz.ex0506_01;

/**
 * @author : 김아름
 * @date   : 2020. 5. 6.
 * @description : 
 */

class Person {
	private int age;
	
	// 1. 생성자를 통한 접근
	public Person() { }
	
	public Person(int age) {
		this.age=age;
	}
	
	// 2. 함수로 접근하여 수정.
	public void setAge(int age) {
		this.age=age;
	}
	
	// 출력 함수
	public void disp() {
		System.out.println("age : "+age);
	}
}

public class Quiz07 {

	public static void main(String[] args) {
		// 7-1] 생성자 접근
		Person person1=new Person(25);
		person1.disp();
		
		// 7-2] 함수 접금
		Person person2=new Person(27);
		person2.disp();
	}

}

package ch04.object.basic;

/**
 * @author : 김아름
 * @date   : 2020. 4. 29.
 * @description : Person 구현 클래스
 */

public class Person {
	
	public String name;			// instance variable, member variable, field
	public int age;
	public float ki;
	
	public void disp() {		// instance function, member function
		System.out.println(name);
		System.out.println(age);
		System.out.println(ki);
		System.out.println();
	}
	
	public void input(String n, int a, float k) { // 파라미터로 넘어온 값을 객체의 변수에 저장하는 함수.
		name=n;
		age=a;
		ki=k;
	}
}

// 객체에 데이터를 전달하는 경우 > 1 . 연산자 2 함수 3 생성자
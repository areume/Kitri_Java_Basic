package api01.Object;

/**
 * @author : 김아름
 * @date   : 2020. 5. 11.
 * @description : java.lang.Object - toString
 */

public class StringExam {

	public static void main(String[] args) {
		/*
		Integer values=new Integer(10);
		System.out.println(values.toString()); //정수형이 문자열로 출력된다.
		
		
		Member member=new Member("abc123","pwd123");
		System.out.println(member.toString()); // member에 할당된 주소값 출력된다.
		System.out.println(member); 		   // toString() 생략해도 내부적으로 호출해준다.
		
		
		System.out.println("=======================");
		*/
		
		Su s=new Su();
		s.setX(10);
		s.setY(20);
		s.setZ(30);
		System.out.println(s.toString()); // 자동으로 오버라이딩한 toString() 메소드 출력.*/
	}

}

package api01.Object;

/**
 * @author : 김아름
 * @date   : 2020. 5. 11.
 * @description : java.lang.Object - equals
 */

public class EqualsExam {

	public static void main(String[] args) {
		
		// String은 데이터가 같으면 참조하고 있는 주소가 같다.
		String a="hi";
		String b="hi";	// "hi"라는 값이 있는지 먼저 메모리를 탐색한다. 존재하면 그 위치의 주소값을 저장.
		
		if(a==b) {
			System.out.println("주소값 비교 T");
		}else {
			System.out.println("주소값 비교 F");
		}
		
		if(a.equals(b)) { //if(b.equals(a)
			System.out.println("데이터 비교 T");
		}else {
			System.out.println("데이터 비교 F");
		}
		
		System.out.println("=================");
		// new 키워드로 String 객체를 생성하면 데이터가 같아도 다른 주소값을 할당받는다.
		String x=new String("hi");
		String y=new String("hi");
		
		if(x==y) {
			System.out.println("주소값 비교 T");
		}else {
			System.out.println("주소값 비교 F");
		}
		
		if(x.equals(b)) {
			System.out.println("데이터 비교 T");
		}else {
			System.out.println("데이터 비교 F");
		}
		
		
		System.out.println("=================");
		
		
		Member kim=new Member("abc123","pw123");
		Member lee=new Member("abc123","pw123");
		
		if(kim==lee) {
			System.out.println("주소값 비교 T");
		}else {
			System.out.println("주소값 비교 F");
		}
		
		// 오버라이드된 함수 호출.
		if(kim.equals(lee)) {
			System.out.println("데이터 비교 T");
		}else {
			System.out.println("데이터 비교 F");
		}
	}
}

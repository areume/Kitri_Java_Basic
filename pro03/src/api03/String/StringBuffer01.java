package api03.String;

/**
 * @author : 김아름
 * @date   : 2020. 5. 13.
 * @description : StringBuffer - 속도가 빠르고, 추가/삭제/수정 작업을 할 수 있다.
 */

public class StringBuffer01 {

	public static void main(String[] args) {
		
		String s1="새천년";
		String s2="대한민국";
		String s3=s1;
		
		System.out.println("s1 hash code : "+s1.hashCode());
		System.out.println("s2 hash code : "+s2.hashCode());
		System.out.println("s3 hash code : "+s3.hashCode());
		System.out.println("===========================");
		
		s1+=s2;
		System.out.println(s1);
		System.out.println(s1.hashCode());	// String 타입이 연산이되면 기존 주소값에 저장된 데이터를 변경하는 것이아닌, 새로운 객체를 만들어 연산한다.
		System.out.println("===========================");
		
		// StringBuffer
		StringBuffer sb1=new StringBuffer("우리나라");
		StringBuffer sb2=new StringBuffer("대한민국");
		System.out.println("sb1 hash code : "+sb1.hashCode());
		System.out.println("sb2 hash code : "+sb2.hashCode());
		System.out.println("===========================");
		
		sb1.append(sb2);		// 문자열 뒤에 추가.
		sb1.append("좋은나라");
		System.out.println(sb1);
		System.out.println("sb1 hash code : "+sb1.hashCode());
		System.out.println("===========================");
		
		StringBuffer str=new StringBuffer("apple");
		System.out.println("문자열 길이 : "+str.length());
		System.out.println("문자열 용량 : "+str.capacity()+" byte");		// 기존 데이터에 무조건 +16byte 해준다. 따라서 21 bytes 출력
		
		
	}

}

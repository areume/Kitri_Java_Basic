package ch01.dataType; 

/**
 * @author : 김아름
 * @date   : 2020. 4. 27.
 * @description : 자료형
 */

public class Exam01 {

	public static void main(String[] args) {
		// println은 출력 후 줄바꿈. print는 출력만.
		System.out.println("안녕하세요");
		System.out.println("하하하하하");
		System.out.print("호호호");
		System.out.println("월요일\n\n");
		System.out.println("화요일\t수요일\n");
		
		// 숫자(정수형, 실수형)
		// 정수형 : byte, short, int, long
		byte a=10;						// 1 byte : -128 ~ 127
		short b=129;					// 2 byte : -32768 ~ 32767
		int c=1000; 					// 4 byte : -2147483648 ~ 2147483647
		long d=6580L;					// 8 byte : -2^63 ~ 2^63-1
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("d : "+d );
		System.out.println("\n");
		
		// 실수형 : float, double 
		 float e=45.5f;					// 4 byte : 1.4*E^-45 ~ 3.4082*E^38
		 double f=123.40;				// 8 byte : 4.92*E^-324 ~ 1.8*E^308
		
		System.out.println("e : "+e);
		System.out.println("f : "+f);
		System.out.println("\n");
		
		// 문자(문자, 문자열)
		// 문자 (2 byte)
		char ch='A';
		char h='가';
		
		System.out.println("ch : "+ch); // 아스키 코드값
		System.out.println("h : "+h);   // utf-8 문자 셋
		System.out.println("\n");
		
		// 문자열 (2 byte 이상 참조형 자료형)
		String str1="Hello Java";
		String str2="안녕하세요.자바";
		String str3="How are you?";
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("\n");
		
		String str4="Hello Java";
		if(str1==str4) { // 주소 비교
			System.out.println("T");
		}
		else {
			System.out.println("F");
		}
		System.out.println("\n");
		
		if(str1.equals(str4)) { // 데이터 비교
			System.out.println("T");
		}
		else {
			System.out.println("F");
		}
		System.out.println("\n");
		
		// 원래는 stack 영역에 올라가지만 new 키워드는 heap 영역으로 올라간다.
		// stack 영역은 같은 내용은 같은 주소를 가지도록.
		// heap 영역은 아예 나눈다.
		String aa=new String("hi");
		String bb=new String("hi");
		if(aa==bb) { // 주소 비교
			System.out.println("T");
		}
		else {
			System.out.println("F");
		}
		System.out.println("\n");
		
		
		if(aa.contentEquals(bb)) { // 데이터 비교
			System.out.println("T");
		}
		else {
			System.out.println("F");
		}
		System.out.println("\n");
		
		// 논리형 자료형 T(1), F(0) 1 byte
		boolean bl1=true;
		boolean bl2=false;
		
		System.out.println("bl1 : "+bl1 );
		System.out.println("bl2 : "+bl2);
		
	}

}

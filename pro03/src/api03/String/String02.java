package api03.String;

import java.util.Date;
import java.util.Scanner;

/**
 * @author : 김아름
 * @date   : 2020. 5. 12.
 * @description : String 클래스 메소드.
 */

public class String02 {

	public static void main(String[] args) {
		
		/*
		String a="apple";
		String b="Apple";
		System.out.println("대소문자 구분 O : "+a.equals(b));			// 대소문자를 구분하여 두 문자열 데이터를 비교한다.
		System.out.println("대소문자 구분 X : "+a.equalsIgnoreCase(b));	// 대소문자를 구분하지 않고 두 문자열의 데이터를 비교한다.
		
		
		System.out.println("========================");
		*/
		
		String subject="Java Programming";
		System.out.println("소문자 : "+subject.toLowerCase());		// 문자열 전체를 소문자로 출력. 원본 데이터에 영향을 주지 않는다.
		System.out.println("대문자 : "+subject.toUpperCase());		// 문자열 전체를 대문자로 출력. 원본 데이터에 영향을 주지 않는다.
		//System.out.println("과목명 : "+subject);
		
		/*
		System.out.println("=============================");
		
		String oldStr="자바는 객체지향적 언어입니다.";
		System.out.println("변경 전 : "+oldStr);
		String newStr=oldStr.replace("자바","Java");				// 문자열에서 문자열을 찾아 지정 문자열로 치환한다.
		System.out.println("변경 후 : "+newStr);
		
		System.out.println("=============================");
		
		String str="How are you?";
		System.out.println("문자열 잘라내기1 : "+str.substring(0,3));	// 문자열에서 begin~end-1 인덱스까지 잘라낸다.
		System.out.println("문자열 잘라내기2 : "+str.substring(4,7));
		System.out.println("문자열 잘라내기3 : "+str.substring(8));		// 문자열에서 begin부터 끝까지 잘라낸다.
		
		System.out.println("=================================");
		
		String trim="        자바                ";
		System.out.println("공백 제거 전 > ["+trim+"]");
		System.out.println("공백 제거 후 > ["+trim.trim()+"]");
		
		System.out.println("=================================");
		
		// 문자 > 숫자/(날짜)
		String value="951207";			// 뷰를 통해 외부에서 데이터가 넘어온다고 생각하자!
		Scanner sc=new Scanner(value);	// Scanner 생성자 중 String을 매개변수로 받는 생성자 호출.
		//System.out.println(sc.next());
		
		int res=sc.nextInt();			// 매개변수로 받은 String을 읽어온다.
		System.out.println(res);
		
		int x=Integer.parseInt(value);	// 매개변수로 들어온 String을 정수로 전환해준다.
		System.out.println(x);
		
		System.out.println("=================================");
		
		// 숫자/(날짜) > 문자
		String valueInt=String.valueOf(10);			// valueOf는 매개변수의 타입에 따라 함수가 오버로딩되어있다.
		String valueFloat=String.valueOf(24.5f);	// 모든 자료형을 문자열로 전환해준다. 클래스를 문자형으로 바꿔주는 것이 toString()이다.
		String valueBool=String.valueOf(true);
		System.out.println(valueInt+"\t"+valueFloat+"\t"+valueBool);
		
		System.out.println("=================================");
				
		Date date=new Date();					// 현재 시스템 날짜를 가져온다.
		System.out.println(date.toString());	// 출력. 모든 API 클래스에는 toString() 메소드를 오버라이딩 하고있다.
		System.out.println(date); 				// Date 클래스에 toString()이 오버라이딩하고 있으므로 명시하지 않아도 내부적으로 toString() 메소드를 호출한다.
		
		
		
		sc.close();
		*/
	}

}

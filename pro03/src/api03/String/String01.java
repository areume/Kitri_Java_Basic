package api03.String;

/**
 * @author : 김아름
 * @date   : 2020. 5. 12.
 * @description : java.lang.String
 */

public class String01 {

	public static void main(String[] args) {
		/*
		String a="apple";
		String b="banana";
		System.out.println(a+"\t"+b);
		*/
		
		String subject="자바프로그래밍";
		//char ch=subject.charAt(5);	// 특정 인덱스 자리의 문자를 반환한다.
		//System.out.println("문자열 추출 : "+ch);
		
		//int len=subject.length();	// 문자열의 길이를 반환한다.
		//System.out.println("문자열 길이 : "+len);
		
		int i=subject.indexOf("아름");	// 해당 문자열의 시작 위치를 반환. 주어진 문자열이 존재하지 않을때는 -1을 반환한다.
		System.out.println("문자열 위치 : "+i);
		
		/*
		// 주민번호에서 성별 정보 출력하기.
		System.out.println("=============");
		String jumin="123456-1234567";
		int juminLen=jumin.length();
		
		if(juminLen!=14) {
			System.out.println("잘못된 주민번호 입니다.");
			
		}else {
			int dash=jumin.indexOf("-");
			
			if(dash!=-1) {	//if(dash==6) 조건을 활용할 수도 있다.
				char gender=jumin.charAt(dash+1);
				
				if(gender=='1'||gender=='3'||gender=='5') System.out.println("남성입니다.");
				else System.out.println("여성입니다.");
				
			}else {
				System.out.println("잘못된 주민번호 입니다.");
			}
		}
		*/
		
	}

}

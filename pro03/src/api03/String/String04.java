package api03.String;

/**
 * @author : 김아름
 * @date   : 2020. 5. 13.
 * @description : String 클래스 메소드 - split("정규표현식") : 정규표현식을 구분자로 해서 부문 문자열을 분리한 후,
 * 													      배열에 저장하고 리턴한다.
 */

public class String04 {

	public static void main(String[] args) {

		// 특정 기호를 기준으로하여 문자열 데이터 분리하기.
		String str="홍길동,이수홍,박연수,김자바,최명호";
		String[] strArray=str.split(",");
	
		for(int i=0;i<strArray.length;i++) {
			System.out.print(strArray[i]+"\t");
		}
		System.out.println();
	
		String text="홍길동&이수홍,박연수,김자바-최명호";
		String[] textArray=text.split("&|,|-");
		
		for(int i=0;i<textArray.length;i++) {
			System.out.print(textArray[i]+"\t");
		}
		System.out.println("\n=====================================");
	
	}

}

package api03.String;

import java.io.UnsupportedEncodingException;

/**
 * @author : 김아름
 * @date   : 2020. 5. 13.
 * @description : String 클래스 메소드 / Encoding, Decoding
 */

public class String03 {

	public static void main(String[] args) throws Exception {
		
		String str="안녕하세요";
		
		// Encoding
		byte[] array=str.getBytes();
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"\t");	// 영문은 아스키코드값, 한글은 문자셋값.
		}
		System.out.println();
	
		// Decoding
		String value=new String(array);			// byte[]을 매개변수로 받아 String 타입 객체 생성.
		System.out.println(value);
		
		// charset 있는 경우
		String string="반가워";
		byte[] byarr=string.getBytes("utf-8");		// euc-kr, iso-8859-1
		String byStr=new String(byarr,"utf-8");		// Encoding
		System.out.println(byStr);					// Decoding
	}

}

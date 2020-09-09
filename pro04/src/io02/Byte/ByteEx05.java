package io02.Byte;

/**
 * @author : 김아름
 * @date   : 2020. 5. 19.
 * @description : character 읽어오기 - 문자 입출력
 * 
 * byte 자료형 입출력, 이미지(엑셀, 파워포인트 등등) 입출력 모두 가능하다.
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteEx05 {

	public static void main(String[] args) {
		
		File file=null;
		FileOutputStream fos=null;
		

		FileInputStream fis=null;
		
		try {
			// 파일 출력.
			// 문자 입출력.
			String str="안녕하세요";			// 문자.
			byte[] data=str.getBytes();		// 바이트로 바꿔서 출력.
			
			// 파일로 내보내기 위한 객체 생성.
			file=new File("C:\\areum\\java\\fileUpDown\\output\\Ex05.txt");
			fos=new FileOutputStream(file);
			
			// 한 번에 바이트 배열 내보내기
			fos.write(data);
			fos.flush();
			
			// 파일 입력.
			fis=new FileInputStream(file);
			byte[] msg=new byte[65536]; // 얼마가 들어올지 모르지 최대치.
			
			int count=fis.read(msg);	// count는 배열의 수를 저장하고 있다.
			String inStr=new String(msg,0,count);
			
			System.out.println(inStr);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
				try {					
					if(fos!=null) fos.close();	
					if(fis!=null) fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}

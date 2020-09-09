package io02.Byte;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : 파일 입출력 : 그림, 멀티미디어, 문자 종류의 데이터를 보낼 수 있다. areum > java에 fileUpDown 디렉터리 생성
 * 
 * 				   바이트 기반 , 문자 기반, 스트림으로 나눈다.
 * 			           바이트 기반 : 그림, 멀티미디어, 문자 등 모든 종류 데이터를 보내고 받을 수 있다.
 * 
 * 				   바이너리 파일로 파일에 쓰기.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteEx01 {

	public static void main(String[] args) {
		
		File file=null;
		FileOutputStream fos=null;
		
		byte[] data=new byte[] {'a','p','p','l','e'};
		
		try {
			// 경로를 지정하여 File 객체 생성.
			file=new File("C:\\areum\\java\\fileUpDown\\ex01.txt");
			// 파일 내보내기를 위해 생성한 객체
			fos=new FileOutputStream(file);
			
			// 파일에 data 내용이 저장되었다.
			for(int i=0;i<data.length;i++) {
				fos.write(data[i]);
			}
			
			fos.flush();	// 버퍼에 잔류하고 있는 데이터를 강제로 출력한다.
			fos.close();	// 시스템 자원을 반납하고 출력 스트림 닫는다. (close 안 할 경우 데이터 손실)
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

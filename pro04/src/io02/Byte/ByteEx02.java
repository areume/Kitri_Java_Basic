package io02.Byte;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : 파일 읽어오기
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteEx02 {

	public static void main(String[] args) {
		
		File file=null;
		FileInputStream fis=null;		
		
		try {
			
			file=new File("C:\\areum\\java\\fileUpDown\\ex01.txt");
			// 파일을 읽어오기 위한 객체 생성
			fis=new FileInputStream(file);
			
			byte[] data=new byte[65536];
			// 파일을 읽어와 data 배열에 저장한 후, 그 수를 저장한다.
			int count=fis.read(data);
			
			// 아스키 코드값으로 출력된다.
			for(int i=0;i<count;i++) {
				System.out.println(data[i]+"\t"+(char)data[i]);
			}
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}

package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : finally에 close를 작성해주어야 문제가 발생하지 않는다. 선언을 try 문 밖으로 빼야한다.
 */

public class ByteEx04 {

	public static void main(String[] args) {
		
		File infile=null;
		File outfile=null;
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			
			infile=new File("C:\\areum\\java\\fileUpDown\\input\\pengsoo.jpg");
			fis=new FileInputStream(infile);
			
			outfile=new File("C:\\areum\\java\\fileUpDown\\output\\pengsoo.jpg");
			fos=new FileOutputStream(outfile);
			
			while(true) {
				int count=fis.read(); // 파일 읽어오기
				if(count==-1) { // 파일의 끝에 도달한 것.
					break;
				}
				
				fos.write(count);
			}
			fos.flush();
			System.out.println("파일 출력");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null) fos.close();	// 들어가지도 않은 것을 close 해주려고 하면 에러가 발생한다.
				if(fis!=null) fis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}

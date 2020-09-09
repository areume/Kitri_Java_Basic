package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : 바이너리로 이미지 읽어서 이미지로 내보내기. / 이미지를 읽어와서 로컬에 저장하기
 */

public class ByteEx03 {

	public static void main(String[] args) {
		
		try {
			// 읽어올 파일 경로
			File infile=new File("C:\\areum\\java\\fileUpDown\\input\\pengsoo.jpg");
			FileInputStream fis=new FileInputStream(infile);
			// 생성할 파일 경로
			File outfile=new File("C:\\areum\\java\\fileUpDown\\output\\pengsoo.jpg");
			FileOutputStream fos=new FileOutputStream(outfile);
			
			while(true) {
				int count=fis.read(); // 파일 읽어오기
				if(count==-1) { // 파일의 끝에 도달한 것.
					break;
				}
				
				fos.write(count);
			}
			
			fos.flush();
			fos.close();
			fis.close();
			
			System.out.println("파일 출력");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

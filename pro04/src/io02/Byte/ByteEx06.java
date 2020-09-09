package io02.Byte;

/**
 * @author : 김아름
 * @date   : 2020. 5. 19.
 * @description : 액셀, 파워포인트, 한글 파일 등 여러가지 파일 읽어오기
 * 
 * 				  BufferedInputStream  - 보조 스트림 : 일정 바이트 모아서 입력.
 * 				  BufferedOutputStream - 보조 스트림 : 일정 바이트 모아서 출력.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class ByteEx06 {

	public static void main(String[] args) {
		
		File infile=null;
		File outfile=null;
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		
		try {
			infile=new File("C:\\areum\\java\\fileUpDown\\input\\practice_in.hwp");
			fis=new FileInputStream(infile);
			bis=new BufferedInputStream(fis,1024); 	// 일반 파일은 1024, 네트워크는 512
			
			outfile=new File("C:\\areum\\java\\fileUpDown\\output\\practice_out.hwp");
			fos=new FileOutputStream(outfile);
			bos=new BufferedOutputStream(fos,1024);	// 
			
			//byte[] data=new byte[65536];
			
			while(true) {
				int count=bis.read();	// 용량이 큰 경우에는 byte 배열에 담지않고 4바이트씩 바로 읽어올 수 있도록.
				if(count==-1) break;
				
				bos.write(count); // 4바이트씩 읽어와 1바이트씩 뿌려준다.
			}
			
			bos.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null) fis.close();
				if(fos!=null) fos.close();
				if(bis!=null) bis.close();
				if(bos!=null) bos.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}

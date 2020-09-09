package io06.Quiz.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class Quiz16 {

	public static void main(String[] args) {
		
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("C:\\areum\\java\\fileUpDown\\input\\quiz16_test.txt");
			
			int count;
			
			while(true) {
				count=fis.read();
				if(count==-1) break;
				System.out.println((char)count);
			}
		} catch(IOException e) {
			System.out.println("에러 발생");
		} finally {
			try {
				if(fis!=null) fis.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}

package io06.Quiz.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Quiz23 {

	public static void main(String[] args) {
		
		File file=null;
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		try {
			file=new File("C:\\areum\\java\\fileUpDown\\input\\quiz23_test.txt");
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis,1024);
			
			while(true) {
				int count=bis.read();
				if(count==-1) break;
				
				System.out.print(String.valueOf((char)count).toUpperCase()); // ★
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bis!=null) bis.close();
				if(fis!=null) fis.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}

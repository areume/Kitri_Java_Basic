package io06.Quiz.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Quiz24 {

	public static void main(String[] args) {
		
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		Scanner sc=null;
		
		try {
			
			// 텍스트 파일에서 불러오기
			file=new File("C:\\areum\\java\\fileUpDown\\output\\quiz22_test.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr,1024);
			
			sc=new Scanner(System.in);
			
			System.out.print("문자를 입력 : ");
			String targetStr=sc.next();
			String findStr=null;
			
			while(true) {
				findStr=br.readLine();
				
				if(findStr==null) {
					System.out.println("해당 문자열이 존재하지 않습니다.");
					break;
				}
				
				if(findStr.equals(targetStr)) {
					System.out.println("동일한 문자열이 존재합니다. ["+findStr+"]");
					break;
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(sc!=null) sc.close();
				if(br!=null) br.close();
				if(fr!=null) fr.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}

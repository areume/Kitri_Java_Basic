package io06.Quiz.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Quiz25 {
	public static void main(String[] args) {
		
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		Scanner sc=null;
		
		try {
			// 텍스트 파일에서 읽어오기
			file=new File("C:\\areum\\java\\fileUpDown\\input\\quiz25_test.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr,1024);
			
			while(true) {
				String str=br.readLine();
				if(str==null) break;
				
				String[] splitStr=str.split(" ");
				
				int sum=0; 
				for(int i=0;i<splitStr.length;i++) {
					sum+=Integer.parseInt(splitStr[i]);
				}
				System.out.println("합은 : "+sum);				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(sc!=null) sc.close();
				
				if(br!=null) br.close();
				if(fr!=null) fr.close();
				
			} catch(Exception e) {
				e.printStackTrace();
				
			}
		}
			
	}
}

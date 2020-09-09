package io06.Quiz.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz22 {

	public static void main(String[] args) {
		
		File file=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		FileReader fr=null;
		BufferedReader br=null;
		
		Scanner sc=null;
		
		try {
			
			// 텍스트 파일에 쓰기
			file=new File("C:\\areum\\java\\fileUpDown\\output\\quiz22_test.txt");
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw,1024);
			
			sc=new Scanner(System.in);
			
			while(true) {
				String str=sc.nextLine();
				if(str.equalsIgnoreCase("q")) break;
				bw.write(str+"\n");
			}
			
			bw.flush();
			
			// 텍스트 파일에서 불러오기
			fr=new FileReader(file);
			br=new BufferedReader(fr,1024);
			
			int lineNum=1;
			
			while(true) {
				String str=br.readLine();
				if(str==null) break;
				System.out.println((lineNum++)+"\t"+str);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(sc!=null) sc.close();
				
				if(br!=null) br.close();
				if(fr!=null) fr.close();
				
				if(bw!=null) bw.close();
				if(fw!=null) fw.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}

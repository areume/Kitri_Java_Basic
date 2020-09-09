package io06.Quiz.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz26 {

	public static void main(String[] args) {
		
		File file=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		Scanner sc=null;
		
		try {
			
			file=new File("C:\\areum\\java\\fileUpDown\\output\\quiz26_test.txt");
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw,1024);
			
			sc=new Scanner(System.in);
			
			System.out.println("데이터를 입력해주세요. (종료:Q)");
			 
			while(true) {
				String str=sc.nextLine();
				if(str.equalsIgnoreCase("Q")) {
					break;
				}
				bw.write(str+"\n");
				System.out.println("종료되었습니다.");
			}
			
			bw.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (sc != null) sc.close();
				
				if (bw != null) bw.close();
				if (fw != null) fw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

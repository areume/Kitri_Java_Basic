package io03.Char;

/**
 * @author : 김아름
 * @date   : 2020. 5. 19.
 * @description : PrintWriter - 출력을 돕는 프린트 보조 스트림 (PrintWriter:문자, PrintStream:)
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class CharEx03 {

	public static void main(String[] args) {
		
		File file=null;
		
		FileWriter fw=null;
		FileReader fr=null;
		
		BufferedWriter bw=null;
		BufferedReader br=null;
		
		PrintWriter pw=null;	// 출력을 돕는 프린트 보조 스트림
		
		Scanner sc=null;
		
		try {
			file=new File("C:\\areum\\java\\fileUpDown\\output\\charEx03.txt");
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw,1024);
			
			pw=new PrintWriter(bw);
			
			fr=new FileReader(file);
			br=new BufferedReader(fr,1024);
			
			// 파일에 쓰기
			System.out.println("문자열을 입력하세요");
			sc=new Scanner(System.in);
			
			while(true) {
				String msg=sc.nextLine();
				
				if(msg.equalsIgnoreCase("q")) break;
				
				pw.println(msg);
				pw.flush();
			}
			System.out.println("\n파일에 내용이 쓰였습니다.\n");
			
			// 파일에서 읽어오기
			fr=new FileReader(file);
			br=new BufferedReader(fr,1024);
			
			while(true) {
				String msg=br.readLine();
				
				if(msg==null) break;
				
				System.out.println(msg);
			}
					
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(br!=null) br.close();
				if(fr!=null) fr.close();
				
				if(pw!=null) pw.close();
				if(bw!=null) bw.close();
				if(fw!=null) fw.close();
				if(sc!=null) sc.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}

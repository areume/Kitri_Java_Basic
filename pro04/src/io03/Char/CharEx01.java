package io03.Char;

/**
 * @author : 김아름
 * @date   : 2020. 5. 19.
 * @description : 문자 입출력 - Read, Writer
 */ 

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharEx01 {

	public static void main(String[] args) {
		
		File file=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		Scanner sc=null;
		
		try {
		
			file=new File("C:\\areum\\java\\fileUpDown\\output\\charEx01.txt");
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw,1024);
			
			System.out.println("문자열을 입력하세요");
			sc=new Scanner(System.in);	
			
			while(true) {
			
				String msg=sc.nextLine();	// next : 공백으로 구분하여 입력을 받는다. nextLine : 줄 단위로 구분하여 입력을 받는다.
				
				if(msg.equalsIgnoreCase("q")) break;
				
				bw.write(msg+"\n\n");
				bw.flush();
			}
		
			System.out.println("내용이 출력되었습니다.");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {		
				try {
					if(fw!=null) fw.close();
					if(bw!=null) bw.close();
					if(sc!=null) sc.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}

}

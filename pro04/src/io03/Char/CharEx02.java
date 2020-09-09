package io03.Char;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author : 김아름
 * @date   : 2020. 5. 19.
 * @description : 문자 입출력 - 바이트 방식보다 편하다.
 */

public class CharEx02 {

	public static void main(String[] args) {
		
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			
			file=new File("C:\\areum\\java\\fileUpDown\\output\\charEx01.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr,1024);
			
			while(true) {
				String str=br.readLine();
				if(str==null) break;
				
				System.out.println(str);
			}
			
		} catch(Throwable e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr!=null) fr.close();
				if(br!=null) br.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}

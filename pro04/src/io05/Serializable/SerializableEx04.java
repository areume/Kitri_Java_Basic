package io05.Serializable;

/**
 * @author : 김아름
 * @date   : 2020. 5. 19.
 * @description : 
 */

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableEx04 {

	public static void main(String[] args) {
		
		
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream("C:\\areum\\java\\fileUpDown\\output\\b.dat");
			bis=new BufferedInputStream(fis,1024);
			ois=new ObjectInputStream(bis); 		// 객체를 출력하는 스트림
			
			Test test=null;
			
			while(true) {
				test=(Test)ois.readObject();	
				if(test==null) break;
				//test=(Test)ois.readObject();
				System.out.println(test.toString());
				
			}
			System.out.println("입력 완료");
			
		}catch(EOFException e) {	// 파일의 내용을 더 이상 읽어 올 것이 없으면. (끝에 도달했을 때) 상속으로 받으면 내부적으로 에러를 던져준다.
			System.out.println("파일을 다 읽었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ois!=null) ois.close();
				if(bis!=null) bis.close();
				if(fis!=null) fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}
}

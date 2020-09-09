package io05.Serializable;

/**
 * @author : 김아름
 * @date   : 2020. 5. 19.
 * @description : 
 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class SerializableEx02 {

	public static void main(String[] args) {
		
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream("C:\\areum\\java\\fileUpDown\\output\\a.dat");
			bis=new BufferedInputStream(fis,1024);
			ois=new ObjectInputStream(bis);
			
			Date date=(Date)ois.readObject();	// Object로 선언되었으므로 다시 다운 캐스팅 해준다.
			System.out.println(date);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
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

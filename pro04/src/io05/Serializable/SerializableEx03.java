package io05.Serializable;

/**
 * @author : 김아름
 * @date   : 2020. 5. 19.
 * @description : 
 */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableEx03 {

	public static void main(String[] args) {
		
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		ObjectOutputStream oos=null;
		
		Test a=new Test(10,22.2f,'A');
		Test b=new Test(20,33.3f,'B');
		Test c=new Test(30,44.4f,'C');
		
		try {
			fos=new FileOutputStream("C:\\areum\\java\\fileUpDown\\output\\b.dat");
			bos=new BufferedOutputStream(fos,1024);
			oos=new ObjectOutputStream(bos); 
			
			oos.writeObject(a);
			oos.writeObject(b);
			oos.writeObject(c);			
			
			oos.flush(); 	// 버퍼가 들어가면 flush로 무조건 비워주어야 한다. stream에 남아있으면 안됨!!
			System.out.println("출력완료");
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null) oos.close();
				if(bos!=null) bos.close();
				if(fos!=null) fos.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}

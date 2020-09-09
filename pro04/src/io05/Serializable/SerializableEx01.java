package io05.Serializable;

/**
 * @author : 김아름
 * @date   : 2020. 5. 19.
 * @description : 직렬화 : 자바 시스템 내부에서 사용되는 Object 또는 data를 외부의 시스템에서도 사용할 수 있도록 byte 형태로 데이터를 변환하는 기술.
 * 
 */

import java.util.Date;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableEx01 {

	public static void main(String[] args) {
		
		Date date=new Date();
		
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream("C:\\areum\\java\\fileUpDown\\output\\a.dat");  // File 객체 생성하지 않고 바로 대입.
			bos=new BufferedOutputStream(fos,1024);
			oos=new ObjectOutputStream(bos);
			
			oos.writeObject(date); // 객체를 내보내는 것을 직렬화라고 한다. (객체를 파일로 출력)
			oos.flush();
			
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

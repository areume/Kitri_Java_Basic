package io01.File;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : 지정한 위치에 디렉터리 만들기, 파일 생성하기
 */

import java.io.File;
import java.io.IOException;

public class FileEx02 {

	public static void main(String[] args) {
		
		File dir=new File("C:\\MyDir");
		// 디렉터리가 존재하는지 확인.
		System.out.println(dir.exists());

		// 디렉터리가 존재하지 않으면 실행.
		if(dir.exists()==false) {
			// 디렉터리 만들기
			dir.mkdir();
			System.out.println("디렉터리가 만들어졌습니다.");
		}
		System.out.println("===========================================");
		
		// dir 경로, abc.txt 파일
		File file=new File(dir,"abc.txt");
		// 디렉터리와 파일이 존재하는지 확인.
		System.out.println(dir.exists()+"\t"+file.isFile());
		
		try {
			// 디렉터리는 존재하지만 파일은 없는 경우.
			if(dir.exists()==true && file.isFile()==false) {
				// 새로운 파일 생성.
				file.createNewFile(); 
				System.out.println("파일이 생성되었습니다.");
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// 디렉터리와 파일이 모두 존재하는 경우.
		if(dir.exists()==true && file.isFile()==true) {
			// 파일 삭제
			file.delete();	
			System.out.println("파일이 삭제되었습니다.");
			// 디렉터리 삭제
			dir.delete();	
			System.out.println("디렉터리가 삭제되었습니다.");
			
		}
		
	}

}

package io01.File;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : 입력 : 키보드, 파일(업로드), 네트워크(채팅)
 * 				    출력 : 화면, 파일(다운로드), 네트워크(채팅)
 * 				  - 네트워크 통신은 스레드 처리가 필요하다.
 */

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
		
		// 파일 시스템의 루트에서 접근 가능한 목록을 반환.
		File[] roots=File.listRoots();	
		
		// 루트의 길이만큼 반복문을 반복.
		for(int i=0;i<roots.length;i++) {
			System.out.println(roots[i]);
		}
		
		// \가 서식문자를 나타낼 때 사용되므로 \\ 를 사용하거나 / 를 사용한다.
		File file=new File("C:\\areum\\java\\workspace\\pro03\\src\\api13\\Exception");
		
		// exists() 메소드는 파일이나 디렉토리가 존재하면 true, 아니면 false를 반환한다.
		if(file.exists()) {
			// 지정한 디렉토리의 파일이나 디렉터리 목록을 String 타입 배열로 반들어 반환한다.
			String[] str=file.list();
			
			for(int i=0;i<str.length;i++) {
				System.out.println(str[i]);
			}
		}
		System.out.println("====================================================");
		
		// 특정 폴더의 원하는 파일을 뽑아내기
		File temp=new File(file,"Ex04.java");
		
		// ★디렉토리가 존재하는지
		System.out.println("디렉토리 존재 : "+temp.exists());
		// ★파일이 존재하는지
		System.out.println("파일 존재 : "+temp.isFile());
		System.out.println("====================================================");
		
		// 디렉터리가 존재하고, 파일이 존재한다면 진행.
		if(temp.exists() && temp.isFile()) {
			System.out.println("파일명 : "+temp.getName());				// 파일명 가져오기
			System.out.println("경로 : "+temp.getParent());				// 파일 경로 가져오기
			System.out.println("파일&경로명 : "+temp.getAbsolutePath()); 	// ★파일명과 경로 가져오기
			System.out.println("쓰기 가능 : "+temp.canWrite());  			// 쓰기 가능 여부
			System.out.println("읽기 가능 : "+temp.canRead());	  			// 읽기 가능 여부
			System.out.println("파일 크기 : "+temp.length()+" byte"); 		// ★파일의 크기
			
		}

	}

}

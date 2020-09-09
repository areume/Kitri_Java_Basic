package api12.Quiz;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		HashMap<String,String> hashmap=new HashMap<String,String>();
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.print("이     름 : ");
			String name=scanner.next();
			System.out.print("전화번호 : ");
			String phone=scanner.next();
			System.out.println();
			hashmap.put(name,phone);
		}
		
		System.out.print("전화번호를 검색할 이름을 입력하세요 : ");
		String find=scanner.next();
		System.out.println(find+" 의 전화번호는 "+hashmap.get(find)+" 입니다.");
		
		scanner.close();
	}
}

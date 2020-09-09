package api09.Map;

/**
 * @author : 김아름
 * @date   : 2020. 5. 15.
 * @description : Array는 전체를 출력할 때 자주 사용되고, Map은 하나를 가져와 출력할 때 자주 사용된다.
 */

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx02 {

	public static void main(String[] args) {
		
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("id","abc123");
		map.put("pwd",12345);	// 12345 Integer로 오토박싱
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디 : ");
			String id=sc.next();
			
			System.out.print("비밀번호 : ");
			int pwd=sc.nextInt();
			
			if(id.equals((String)map.get("id"))) {
				
				if(pwd==(Integer)map.get("pwd")) {
					System.out.println("로그인 성공");
					sc.close();
					break;
				}else {
					System.out.println("비밀번호를 확인해주세요.");
				}
				
			}else {
				System.out.println("아이디를 확인해주세요.");
			}
		}
		
	}

}

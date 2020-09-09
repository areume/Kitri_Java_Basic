package api12.Quiz;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.print("나라 : ");
			String nation=sc.next();
			System.out.print("인구 : ");
			int popul=sc.nextInt();
			System.out.println();
			
			map.put(nation,popul);
		}
		
		System.out.print("검색할 나라의 이름을 입력하세요 : ");
		String nation=sc.next();
		
		DecimalFormat df=new DecimalFormat("#,###");
		System.out.println(nation+"의 인구는 "+df.format(map.get(nation))+" 명 입니다.");
		
		sc.close();
	}

}

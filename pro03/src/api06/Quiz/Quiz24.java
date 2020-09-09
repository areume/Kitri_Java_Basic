package api06.Quiz;

import java.util.StringTokenizer;

public class Quiz24 {
	public static void main(String[] args) {
		String str="아이디, 이름, 패스워드";
		
		// 1] split
		String[] strArr=str.split(",");
		
		for(int i=0;i<strArr.length;i++) {
			System.out.println("["+strArr[i].trim()+"]");
		}
		
		System.out.println("==========");
		
		// 2] StringTokenizer
		StringTokenizer token=new StringTokenizer(str,",");
		
		while(token.hasMoreTokens()) {
			System.out.println("["+token.nextToken().trim()+"]");
		}
	}
}

package api12.Quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz22 {
	public static void main(String[] args) {
		
		HashMap<String,Double> score=new HashMap<String,Double>();
		score.put("A",4.0);
		score.put("B",3.0);
		score.put("C",2.0);
		score.put("D",1.0);
		
		ArrayList<String> arr=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=1;i<=5;i++) {
			System.out.print(i+"번째 학점 입력 : ");
			String hakjum=sc.next();
			arr.add(hakjum);
		}
		sc.close();
		System.out.println();
		
		for(int i=1;i<=arr.size();i++) {
			System.out.println(i+"번째 학점 : "+arr.get(i-1)+"="+score.get(arr.get(i-1)));
		}
	}
}

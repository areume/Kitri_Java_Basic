package api12.Quiz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		
		HashSet<String> hashset=new HashSet<String>();
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.print("좋아하는 커피를 3가지 입력하세요 : ");
			String coffee=scanner.next();
			hashset.add(coffee);
		}
		scanner.close();

		Iterator<String> iterator=hashset.iterator();
		System.out.println("\n\n입력하신 커피 : "+hashset.size());
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}

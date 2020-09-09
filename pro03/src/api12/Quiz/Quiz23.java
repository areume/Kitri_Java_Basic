package api12.Quiz;

import java.util.ArrayList;
import java.util.Iterator;

public class Quiz23 {

	public static void main(String[] args) {
		
		ArrayList<Integer> array=new ArrayList<Integer>();
		
		for(int i=1;i<=20;i++) {
			array.add(i);
		}
		
		Iterator<Integer> iter=array.iterator();
		
		while(iter.hasNext()) {
			System.out.print(array.get(iter.next())+" ");
		}

	}

}

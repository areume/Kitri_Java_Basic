package ch02.control;

/**
 * @author : 김아름
 * @date   : 2020. 4. 28.
 * @description : while 문에 사용된 continue, break
 */

public class Exam10 {

	public static void main(String[] args) {

		int i=1;
		while(i<=10) {
			if(i==5) break;
			
			System.out.print(i+"\t");
			i++;
		}
		System.out.println();
		
		int j=0;
		while(j<10) {
			j++;
			if(j==5) continue;
			
			System.out.print(j+"\t");
		}
		System.out.println();
		
		int k=0;
		do {
			k++;
			
			if(k==5) break;
			
			System.out.print(k+"\t");
		}while(k<=10);
		System.out.println();
		
		int m=0;
		do {
			m++;
			if(m==5) continue;
			System.out.print(m+"\t");
		}while(m<=10);

	}

}

package api12.Quiz;

import java.util.Scanner;
import java.util.Vector;

public class Quiz24 {

	public static void main(String[] args) {
		
		Vector<Double> vector=new Vector<Double>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=10;i++) {
			System.out.print(i+"번째 수를 입력하세요 : ");
			double temp=sc.nextDouble();
			vector.add(temp);
		}
		sc.close();

		double max=vector.get(0);
		for(int i=1;i<10;i++) {
			if(max<vector.get(i)) {
				max=vector.get(i);
			}
		}
		
		System.out.println("\n가장 큰 수 : "+max);
		
	}

}

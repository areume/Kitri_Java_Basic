package test;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		check(sc);
	}
	
	public static void check(Scanner sc) {
		
		int number=sc.nextInt();
		
		if(number==0) {
			System.out.println("0이 입력되었습니다.");
			return;
		}else {
			System.out.println("0이 아닙니다.");
			check(sc);
		}
	}

}

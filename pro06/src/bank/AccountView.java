package bank;

import java.util.Scanner;

import jdbcUtil.DriverProvider;	// 내가 만든 클래스 import해서 사용하기.

/**
 * @author : 김아름
 * @date   : 2020. 5. 26.
 * @description : 
 */

public class AccountView {
	public static void main(String[] args) {
		
		// 1단계 : 데이터베이스 연결
		DriverProvider dp=new DriverProvider();
		dp.getDriver();
		
		AccountDAO jbank=new AccountDAO();
		Scanner sc=new Scanner(System.in);		
		
		while(true) {
			printMenu();
			
			System.out.print("선택 : ");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				jbank.makeAccount();
				System.out.println();
				break;
			case 2:
				jbank.deposit();
				break;
			case 3:
				jbank.withdraw();
				break;
			case 4:
				jbank.inquire();
				break;
			case 5:
				System.out.println(jbank.showData());
				break;
			case 6:
				System.out.println("종료합니다.");
				if(sc!=null) sc.close();
				System.exit(0);		
			}
		}

	}
	
	public static void printMenu() {
		System.out.println("\nMenu----------------");
		System.out.println("1. 계좌개설");
		System.out.println("2. 입     금");
		System.out.println("3. 출     금");
		System.out.println("4. 잔액조회");
		System.out.println("5. 전체출력");
		System.out.println("6. 종     료");
		System.out.println("--------------------");
	}

}

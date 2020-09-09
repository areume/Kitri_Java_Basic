package api11.MVC.Bank;

import java.util.Scanner;

/**
 * @author : 김아름
 * @date   : 2020. 5. 15.
 * @description : MVC - View (Java로 View 작성하지 않는다. HTML 이용)
 */

public class AccountView {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		AccountManager manager=new AccountManager();
		
		while(true) {
			printMenu();
			
			System.out.print("선택 : ");
			int choice=scanner.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1: 
				manager.makeAccount();
				break;
			case 2:
				manager.deposit();
				break;
			case 3:
				manager.withdraw();
				break;
			case 4:
				manager.inquire();
				break;
			case 5:
				manager.disp();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");		// DB와 연동이 되어야 데이터가 기록된다. 종료 후 다시 실행하면 ArrayList는 비워진다.
				scanner.close();
				return;
			default:
				System.out.println("잘 못 입력하셨습니다.");
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

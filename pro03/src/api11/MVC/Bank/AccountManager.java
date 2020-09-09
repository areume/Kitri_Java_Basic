package api11.MVC.Bank;

/**
 * @author : 김아름
 * @date   : 2020. 5. 15.
 * @description : MVC - Controller
 */

import java.util.Scanner;
import java.util.ArrayList;

public class AccountManager {
	
	private ArrayList<Account> list;
	private Scanner scanner;
	
	public AccountManager() {
		list=new ArrayList<Account>();
		scanner=new Scanner(System.in);
	}
	
	public void makeAccount() { // 계좌 개설
		
		Account account=new Account();
		
		System.out.print("계좌번호 : ");
		account.setId(scanner.nextInt());
		
		System.out.print("이름 : ");
		account.setName(scanner.next());
		
		System.out.print("잔액 : ");
		account.setBalance(scanner.nextLong());
		
		list.add(account);
		
		System.out.println("\n계좌가 개설되었습니다.");
		//System.out.println(list.toString()+"\n");
	}
	
	public void disp() {
		for(int i=0;i<list.size();i++) {
			Account account=list.get(i);
			System.out.println(account.getId()+"\t"+account.getName()+"\t"+account.getBalance());
		}
	}
	
	public void deposit() {
		System.out.print("계좌번호 : ");
		int id=scanner.nextInt();
		
		// ArrayList 탐색하여 동일한 계좌번호 찾기
		for(int i=0;i<list.size();i++) {
			Account acc=list.get(i);
			
			if(acc.getId()!=id) {	// 계좌번호가 다른 경우 반복문 계속 진행.
				continue;
			}else {	// 계좌번호가 같은 경우 입금 진행. 
				System.out.print("입금액 : ");
				long money=scanner.nextLong();
				
				long balance=acc.getBalance()+money;
				acc.setBalance(balance);	// 저장되어있는 값과 매개변수 값을 더한 값을 잔액으로 지정.
				System.out.println("입금 완료 되었습니다.");
				return;
			}
		}
		// for문에서 함수가 종료되지 않으면 일치하는 계좌가 없는 경우.
		System.out.println("해당하는 계좌가 존재하지 않습니다.");
	}
	
	public void withdraw() {
		System.out.print("계좌번호 : ");
		int id=scanner.nextInt();
		
		for(int i=0;i<list.size();i++) {
			Account acc=list.get(i);
			
			if(acc.getId()!=id) {
				continue;
			}else {
				
				System.out.print("출금액 : ");
				long money=scanner.nextLong();
				long balance=acc.getBalance();
				
				if(balance<money) {	// 출금액이 더 많으면 출금 불가.
					System.out.println("잔액이 부족합니다.");
					return;
				}else {
					acc.setBalance(balance-money);
					return;
				}
				
			}
		}
		System.out.println("해당하는 계좌가 존재하지 않습니다.");
	}
	
	public void inquire() {
		System.out.print("계좌번호 : ");
		int id=scanner.nextInt();
		
		for(int i=0;i<list.size();i++) {
			Account acc=list.get(i);
			
			if(acc.getId()!=id) {
				continue;
			}else {
				System.out.println("계좌번호 : "+acc.getId()+"\t이름 : "+acc.getName()+"\t잔액 : "+acc.getBalance());
				return;
			}
		}
		System.out.println("해당하는 계좌가 존재하지 않습니다.");
	}
}

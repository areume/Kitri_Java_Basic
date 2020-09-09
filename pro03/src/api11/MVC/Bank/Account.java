package api11.MVC.Bank;

/**
 * @author : 김아름
 * @date   : 2020. 5. 15.
 * @description : MVC - Model(Oracle, MSSQL, MySQL / RDBMS), DB와 Java를 연결. (Model에서는 데이터를 넣고 빼는 작업만 진행한다.)
 */

public class Account {
	// 필드
	private int id;			// 계좌번호
	private String name;	// 이름
	private long balance;	// 잔액
	
	// 생성자
	public Account() { }

	public Account(int id, String name, long balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	// Getter & Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	// 메소드
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
}

package bank;

/**
 * @author : 김아름
 * @date   : 2020. 5. 26.
 * @description : MVC - DB 연동 (계좌 정보 관리)
 */

public class AccountDTO {
	
	private int num;		// 자동 증가 번호
	private String id;		// 계좌번호
	private String name;	// 이름
	private long balance;	// 잔액
	
	// 생성자
	public AccountDTO() { }
	
	public AccountDTO(int num, String id, String name, long balance) {
		super();
		this.num = num;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	// getters and setters
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	// toString() 메소드 오버라이딩
	@Override
	public String toString() {
		return "AccountDTO [num=" + num + ", id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}	
}

package ch00.quizInterface;

interface DataAccessObject {
	public void select();
	public void insert();
	public void update();
	public void delete();
}

class OracleDao implements DataAccessObject {
	public void select() {
		System.out.println("OracleDao 검색");
	}
	
	public void insert() {
		System.out.println("OracleDao 삽입");
	}
	
	public void update() {
		System.out.println("OracleDao 수정");
	}
	
	public void delete() {
		System.out.println("OracleDao 삭제");
	}
}

class MySqlDao implements DataAccessObject {
	public void select() {
		System.out.println("MySqlDao 검색");
	}
	
	public void insert() {
		System.out.println("MySqlDao 삽입");
	}
	
	public void update() {
		System.out.println("MySqlDao 수정");
	}
	
	public void delete() {
		System.out.println("MySqlDao 삭제");
	}
}

public class Quiz09 {
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
	
	private static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		System.out.println();
	}
}

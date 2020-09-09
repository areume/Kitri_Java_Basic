package jdbcUtil;

/**
 * @author : 김아름
 * @date   : 2020. 5. 26.
 * @description : 매번 연결하는 코드를 작성할 수 없으므로 공유할 수 있는 클래스를 생성
 */

public class DriverProvider {
	
	public void getDriver() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

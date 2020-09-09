package jdbcUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author : 김아름
 * @date   : 2020. 5. 26.
 * @description : 매번 연결하는 코드를 작성할 수 없으므로 공유할 수 있는 클래스를 생성
 */

public class ConnectionProvider {
	
	public static Connection getConnection() {
		
		Connection conn=null;
		
		try {
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String id="java";
			String pass="1234";
			
			conn = DriverManager.getConnection(url, id, pass);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
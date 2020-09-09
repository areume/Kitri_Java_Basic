package db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author : 김아름
 * @date   : 2020. 5. 25.
 * @description : 데이터베이스 연결하기 (select)
 */

public class Ex01 {

	public static void main(String[] args) {
		
		// 1단계 : 데이터베이스 연결		
		try {
			
			String className="oracle.jdbc.driver.OracleDriver";
			Class.forName(className);
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 2단계 : 연결을 관리하는 객체 생성
		try {
			
			String url="jdbc:oracle:thin:@localhost:1521:xe"; // localhost대신 자신의 ip 주소 사용가능.
			String id="java";
			String pass="1234";
			
			Connection conn=DriverManager.getConnection(url,id,pass);	
			// System.out.println(conn); // NULL 나오면 오류!
			
			// 3단계 : 작업관리 (Query)
			PreparedStatement pstmt=conn.prepareStatement("select * from dept");	// 자바에서는 sql 에러를 잡아줄 수 없다.
			
			// 4단계 : 결과 처리
			ResultSet rs=pstmt.executeQuery(); // select는 executeQuery()
			
			while(rs.next()) {
				
				int deptNo=rs.getInt("deptno");
				String deptName=rs.getString("dname");
				String location=rs.getString("loc");
				
				System.out.println(deptNo+"\t"+deptName+"\t\t"+location);
			}
			
			// 5단계 : 종료
			rs.close();
			pstmt.close();
			conn.close();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}

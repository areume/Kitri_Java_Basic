package db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author : 김아름
 * @date   : 2020. 5. 26.
 * @description : update - 데이터가 있는지 확인한 후에 수정을 진행한다. / 실행 후, sql developer에서 데이터가 변경되었는지 반드시 확인하자.
 */

public class Ex03 {
	public static void main(String[] args) {

		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		Scanner sc=null;		
		
		// 데이터베이스 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		
		// 연결관리 객체 Connection 객체 생성	
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "java";
			String pass = "1234";

			conn = DriverManager.getConnection(url, id, pass);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		// 작업 관리 - PreparedStatement, 결과처리 - ResultSet / int, 종료 - 각각의 close		
		try {
			
			sc=new Scanner(System.in);
			System.out.print("번호 : ");
			int bunho=sc.nextInt();
			
			String sql="select * from person where bunho=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,bunho);
			
			rs=pstmt.executeQuery();
			if(rs.next()) { // 제일 처음에는 커서가 첫번째 데이터 전에 위치하고 있다. 다음 값이 있으면 true, 없으면 false
				System.out.println(rs.getInt("bunho")+"\t"+rs.getString("name")+"\t"+rs.getFloat("ki"));
				
				System.out.print("키 수정 : ");
				float ki=sc.nextFloat();
				
				String sqlUp="update person set ki=? where bunho=?";
				if(pstmt!=null) pstmt.close();
				pstmt=conn.prepareStatement(sqlUp);
				pstmt.setFloat(1,ki);
				pstmt.setInt(2,bunho);
				
				int check=pstmt.executeUpdate();
				System.out.println(check);	// 함수의 리턴값으로 사용해 웹에서 팝업창을 이용해 메세지를 전달할 때 사용한다.
				
			}else {
				System.out.println("해당 번호의 데이터가 존재하지 않습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (sc!=null) sc.close();
				if (conn!=null) conn.close();
				if (rs!=null) rs.close();
				if (pstmt!=null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}

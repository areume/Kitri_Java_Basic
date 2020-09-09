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
 * @description : delete - 해당 데이터가 있는지 확인한 후에 데이터 삭제를 진행한다.
 */

public class Ex04 {

	public static void main(String[] args) {
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		Scanner sc=null;
		
		try {		
			Class.forName("oracle.jdbc.driver.OracleDriver");	
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String id="java";
			String pass="1234";
			
			conn=DriverManager.getConnection(url,id,pass);
			// 여기까지 작성하고 실행해보고 에러가 나지 않으면 연결에 성공한 것이다. 나중에 에러를 찾기 힘드니 먼저 확인하도록 한다.
			
			sc=new Scanner(System.in);
			System.out.print("번호 : ");
			int bunho=sc.nextInt();
			
			String sql="select * from person where bunho=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,bunho);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				
				System.out.println(rs.getInt("bunho")+"\t"+rs.getString("name")+"\t"+rs.getFloat("ki")+"\n");
				
				System.out.print("정말로 삭제하시겠습니까? (y/n) : ");
				String value=sc.next();
				if(value.equalsIgnoreCase("y")) {
					
					String sqlDel="delete from person where bunho=?";
					
					if(pstmt!=null) pstmt.close();
					pstmt=conn.prepareStatement(sqlDel);
					pstmt.setInt(1,bunho);
					
					int check=pstmt.executeUpdate();
					
					if(check>0) {
						System.out.println(check+" : 해당 데이터를 삭제했습니다.");
					}
					
				}else {
					System.out.println("데이터를 삭제하지 않습니다.");
				}
	
			}else {
				System.out.println("해당하는 번호의 데이터가 존재하지 않습니다.");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {	
				if(sc!=null) sc.close();
				if(conn!=null) conn.close();
				if(pstmt!=null) pstmt.close();
				if(rs!=null) rs.close();	
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}

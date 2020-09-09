package db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * @author : 김아름
 * @date   : 2020. 5. 25.
 * @description : 데이터를 입력받아 insert 해주기
 */

public class Ex02 {

	public static void main(String[] args) {
		
		
		try {
			// 1단계 : 데이터베이스 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계 : 연결을 관리하는 객체 생성
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String id="java";
			String pass="1234";
			
			Connection conn=DriverManager.getConnection(url,id,pass);
			
			// 3단계 : 작업관리 (Query)
			Scanner sc=new Scanner(System.in);
			
			System.out.print("번호 : ");
			int bunho=sc.nextInt();
			System.out.print("이름 : ");
			String name=sc.next();
			System.out.print(" 키  : ");
			float ki=sc.nextFloat();
			
			// 정적 쿼리는 sql에 자바명령어 입을 특수문자(홀따옴표, 쌍따옴표)를 이용해서 나타낸 후 같이 넘겨준다.			
			// 동적 쿼리는 sql을 넘겨준 후에 값을 넘어준다.
			
			String sql="insert into person values(?,?,?)"; // 칼럼에 들어갈 값을 ?로 처리한다.
			PreparedStatement pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1, bunho);		// 1번째 ? 자리에 int형 bunho 값이 들어간다.
			pstmt.setString(2, name);	// 2번째 ? 자라에 String형 name 값이 들어간다.
			pstmt.setFloat(3, ki);		// 3번째 ? 자리에 Float형 ki값이 들어간다.
			
			// 4단계 : 결과 처리
			int check=pstmt.executeUpdate(); // insert, update, delete는 executeUpdate()
			//System.out.println(check);
			
			if(check>0) System.out.println("데이터 추가 성공");
			
			// 5단계 : 종료
			pstmt.close();
			sc.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

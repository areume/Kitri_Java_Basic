package network02.TCP;

/**
 * @author : 김아름
 * @date   : 2020. 5. 22.
 * @description : 콘솔에서 실행할 ClientEx 코드 작성 ★메소드 파라미터 자세히 살펴보장★
 */

import java.net.Socket;
import java.io.IOException;
import java.net.InetSocketAddress;

public class ClientEx {

	public static void main(String[] args) {

		InetSocketAddress isa=null;
		Socket socket=null;	
		
		try {
			isa=new InetSocketAddress("192.168.0.17",5000);	// 서버와 통신할 때 포트번호 일치해야 한다.
			
			socket=new Socket();		// 네트워크 통신을 위해서는 socket이 필요하다.
			socket.connect(isa);		// 연결하려면 IP 주소와 port 번호가 필요하다.
			
			System.out.println("클라이언트가 연결을 요청합니다.");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(socket!=null) socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}

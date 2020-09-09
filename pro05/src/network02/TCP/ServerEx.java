package network02.TCP;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : 김아름
 * @date   : 2020. 5. 22.
 * @description : 콘솔에서 실행할 ServerEx 코드 작성  ★메소드 파라미터 자세히 살펴보장★서버가 먼저 실행되어 포트를 열어주어야 클라이언트가 접속할 수 있다★
 */

public class ServerEx {

	public static void main(String[] args) {
		
		InetSocketAddress isa=null;
		
		ServerSocket serverSocket=null;
		Socket socket=null;
		
		try {
			isa=new InetSocketAddress(5000);	// 클라이언트와 같은 포트를 사용한다.
			
			serverSocket=new ServerSocket();	// 서버소켓 생성
			serverSocket.bind(isa);				// 해당하는 번호의 포트를 열고 기다린다. (대기)
			System.out.println("서버가 연결을 기다리고 있습니다.");
			
			socket=serverSocket.accept();		// 클라이언트 접속 후 연결 수락.
			
			InetAddress ia=socket.getInetAddress();
			String ip=ia.getHostAddress();
			System.out.println("접속 IP : "+ip);
				
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket!=null) socket.close();
				if(serverSocket!=null) serverSocket.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}

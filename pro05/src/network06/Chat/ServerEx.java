package network06.Chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : 김아름
 * @date   : 2020. 5. 25.
 * @description : 스레드 처리
 */

public class ServerEx {

	public static void main(String[] args) {
		
		
		ServerSocket serversocket=null;
		Socket socket=null;
		
		try {
			
			serversocket=new ServerSocket(8989);
			System.out.println("서버 챗팅 준비중...");
			
			socket=serversocket.accept();
			
			ServerReceiver receiver=new ServerReceiver(socket);
			receiver.start();
			
			ServerSender sender=new ServerSender(socket);
			sender.start();
	
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(serversocket!=null) serversocket.close();
				
			}catch(IOException e) {
				e.printStackTrace();
				
			}
		}

	}

}

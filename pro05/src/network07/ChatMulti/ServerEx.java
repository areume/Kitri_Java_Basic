package network07.ChatMulti;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerEx {

	public static void main(String[] args) {
		
		
		ServerSocket serversocket=null;
		
		try {
			
			serversocket=new ServerSocket(7575);
			System.out.println("서버 챗팅 준비중...");
			
			while(true) {
			
				Socket socket=serversocket.accept();
				
				ServerArr arr=new ServerArr(socket);	// 다수의 클라이언트가 들어올 수 있도록 배열로 처리해준다.
				arr.start();				
			}
	
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

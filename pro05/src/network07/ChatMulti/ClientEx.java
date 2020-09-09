package network07.ChatMulti;

import java.net.Socket;

public class ClientEx {

	public static void main(String[] args) {
				
		Socket socket=null;
		
		try {
			
			socket=new Socket("192.168.0.17",7575);
			
			ClientSender sender=new ClientSender(socket, "아름");
			sender.start();
			
			ClientReceiver receiver=new ClientReceiver(socket);
			receiver.start();

		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

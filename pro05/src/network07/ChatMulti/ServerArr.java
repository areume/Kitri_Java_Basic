package network07.ChatMulti;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

// ArrayList는 동기화 작업이 안되서 Vector를 썻지만 Collections.synchronizedList 메소드 생김.
// 서버는 받은 메세지를 다른 사용자에서 뿌려준다.

import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServerArr extends Thread {

	private Socket socket;
	public static List<PrintWriter> list=Collections.synchronizedList(new ArrayList<PrintWriter>()); // 
	private PrintWriter pw;
	
	public ServerArr(Socket socket) { // [0] pw > 홍길동, [1] pw > 김길동
		this.socket=socket;
		sendArr();
	}
	
	public void sendArr() {
		
		try {
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw = new PrintWriter(bw);
			list.add(pw);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public void sendPrintAll(String str) {
		for(PrintWriter pw : list) {
			pw.println(str);
			pw.flush();
		}
	}
	
	@Override
	public void run() {
		
		BufferedReader br=null;
		
		String nickName=null;
		
		try {
			
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()),512);
			
			nickName=br.readLine();
			sendPrintAll("#"+nickName+"님이 들어오셨습니다.");
			
			while(true) {
				String inputMsg=br.readLine();
				
				if(inputMsg.equalsIgnoreCase("Q")) {
					sendPrintAll("#"+nickName+" 님이 채팅방을 나갔습니다.");
					list.remove(pw);	// 해당 스레드가 가지고 있는 pw 객체를 삭제해준다.
					break;
				}
				
				sendPrintAll(nickName+" >>> "+inputMsg);
			}
			
			
		}catch(NullPointerException | SocketException e) {
			sendPrintAll("#"+nickName+" 님이 채팅방을 나갔습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
		// 서버는 클라이언트가 종료할 때까지 계속 열려있어야 한다.
	}
}

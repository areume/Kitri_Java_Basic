package network07.ChatMulti;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSender extends Thread {
	
	private Socket socket;
	private String nickName;
	
	public ClientSender(Socket socket, String nickName) {
		this.socket=socket;
		this.nickName=nickName;
		
		System.out.println("채팅을 시작합니다.");
	}
	
	@Override
	public void run() {
		
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner sc=null;
		
		try {
			
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()),512);
			pw=new PrintWriter(bw);
			sc=new Scanner(System.in);
			
			pw.println(nickName);
			pw.flush();
			
			while(true) {
				String outputMsg=sc.nextLine();
				
				if(outputMsg.equalsIgnoreCase("Q")) {
					pw.println(outputMsg);
					pw.flush();
					break;
				}
				
				pw.println(outputMsg);
				pw.flush();
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(sc!=null) sc.close();
				if(pw!=null) pw.close();
				if(bw!=null) bw.close();
				
			} catch(IOException	e) {
				e.printStackTrace();
			}
		}
	}
	
}

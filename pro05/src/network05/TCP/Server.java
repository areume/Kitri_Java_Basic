package network05.TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author : 김아름
 * @date   : 2020. 5. 22.
 * @description : 계속 주고받기 - 클라이언트만 종료 가능
 */

public class Server {

	public static void main(String[] args) {
		
		ServerSocket serversocket=null;
		Socket socket=null;
		
		BufferedReader br=null;
		
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner sc=null;
		
		try {
			
			InetSocketAddress isa=new InetSocketAddress(6565);
			serversocket=new ServerSocket();
			serversocket.bind(isa);
			System.out.println("서버 연결");
			
			socket=serversocket.accept();
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()),512);
			
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()),512);
			pw=new PrintWriter(bw);
			sc=new Scanner(System.in);
			
			String inputMsg=null;
			String outputMsg=null;
			
			while(true) {
				
				// 수신
				inputMsg=br.readLine();
				if(inputMsg.equalsIgnoreCase("q")) {
					break;
				}
				System.out.println(inputMsg);
				
				// 송신
				outputMsg=sc.nextLine();
				pw.println("서버 >> "+outputMsg);
				pw.flush();
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(sc!=null) sc.close();
				if(pw!=null) pw.close();
				if(bw!=null) bw.close();
				
				if(br!=null) br.close();
				if(socket!=null) socket.close();
				if(serversocket!=null) serversocket.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}

package network05.TCP;

import java.net.InetSocketAddress;

/**
 * @author : 김아름
 * @date   : 2020. 5. 22.
 * @description : 계속 주고 받기
 */

import java.net.Socket;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		Socket socket=null;
		
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner sc=null;
		
		BufferedReader br=null;
		
		try {
			
			socket=new Socket();
			socket.connect(new InetSocketAddress("192.168.0.17",6565));
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()),512);
			pw=new PrintWriter(bw);
			sc=new Scanner(System.in);
			
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()),512);
			
			String outputMsg=null;
			String inputMsg=null;

			
			while(true) {
				
				// 송신
				outputMsg=sc.nextLine();
				if(outputMsg.equalsIgnoreCase("q")) { // 서버에 정보를 전달하고 종료. (서버도 종료가 되도록)
					pw.println(outputMsg);
					pw.flush();
					break;
				}
				
				pw.println("아름 >> "+outputMsg);
				pw.flush();
				
				// 수신
				inputMsg=br.readLine();
				System.out.println(inputMsg);
			}
	
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(sc!=null) sc.close();
				if(pw!=null) pw.close();
				if(bw!=null) bw.close();
				if(socket!=null) socket.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}

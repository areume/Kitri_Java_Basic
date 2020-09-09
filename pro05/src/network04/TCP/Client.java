package network04.TCP;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
//import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;



/**
 * @author : 김아름
 * @date   : 2020. 5. 22.
 * @description : 메세지 주고 받기
 */

public class Client {

	public static void main(String[] args) {
		
		Socket socket=null;
		
		OutputStream os=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner sc=null;
		
		BufferedReader br=null;
		
		try {
			
			InetSocketAddress isa=new InetSocketAddress("192.168.0.17",7878);
					
			socket=new Socket();
			socket.connect(isa);
			
			// 출력
			os=socket.getOutputStream();
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw,512);
			pw=new PrintWriter(bw);
			
			sc=new Scanner(System.in);
			System.out.println("전송할 문자 : ");
			String msg=sc.nextLine();
			pw.println(msg);
			pw.flush();
			
			// 입력
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()),512);
			
			String reply=br.readLine();
			System.out.println("서버가 보낸 메세지 : "+reply);
			
			
		} catch(UnknownHostException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				
				if(br!=null) br.close();
				
				if(sc!=null) sc.close();
				if(pw!=null) pw.close();
				if(bw!=null) bw.close();
				if(osw!=null) osw.close();
				if(os!=null) os.close();
				if(socket!=null) socket.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}

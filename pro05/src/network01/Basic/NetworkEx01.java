package network01.Basic;

/**
 * @author : 김아름
 * @date   : 2020. 5. 22.
 * @description : 네트워크 기초
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkEx01 {
	public static void main(String[] args) {

		try {
			InetAddress a=InetAddress.getByName("www.kitri.re.kr");
			System.out.println("IP 주소   : "+a.getHostAddress());
			System.out.println("도메인네임 : "+a.getHostName());
			System.out.println("==================================");
			
			InetAddress b=InetAddress.getLocalHost();
			System.out.println("IP 주소   : "+b.getHostAddress());
			System.out.println("도메인네임 : "+b.getHostName());
			System.out.println("==================================");			
			
			InetAddress[] c=InetAddress.getAllByName("www.naver.com"); // getAllByName은 배열 형태로 반환된다.
			//System.out.println(c.length);
			for(int i=0;i<c.length;i++) {
				System.out.println("IP 주소   : "+c[i].getHostAddress());
				System.out.println("도메인네임 : "+c[i].getHostName());
				System.out.println();
			}
			System.out.println("==================================");
			
			InetAddress[] d=InetAddress.getAllByName("www.google.com");
			//System.out.println(d.length);
			for(int i=0;i<d.length;i++) {
				System.out.println("IP 주소   : "+d[i].getHostAddress());
				System.out.println("도메인네임 : "+d[i].getHostName());
				System.out.println();
			}
			
		} catch (UnknownHostException e) {	// host 주소가 없는 경우는 에외가 발생한다.
			e.printStackTrace();
		}

	}

}

package api03.String;

/**
 * @author : 김아름
 * @date   : 2020. 5. 13.
 * @description : StringTokenizer
 */

import java.util.StringTokenizer;

public class StringTokenizer03 {

	public static void main(String[] args) {
		
		String strText="홍길동/이영자/조인성";
		StringTokenizer st=new StringTokenizer(strText,"/");
		System.out.println("count : "+st.countTokens());
		
		while(st.hasMoreTokens()) {			// 토큰이 남아있으면 반복문 진행. 토큰을 분리하고 끝나면 더이상 작업할 수 없다.
			String token=st.nextToken();	// 토큰을 하나씩 꺼내오기.
			System.out.println(st.countTokens()+" : "+token);
		}
		
		// 분리가 다 끝나서 결과가 나오지 않음.
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.println(st.countTokens()+" : "+token);
		}
		System.out.println("===========");
		
		String strValue="홍길동/이영자*조인성";
		StringTokenizer stoken=new StringTokenizer(strValue,"/");
		
		while(stoken.hasMoreTokens()) {
			String token=stoken.nextToken();
			
			StringTokenizer ken=new StringTokenizer(token,"*");
			
			while(ken.hasMoreTokens()) {
				System.out.println(ken.nextToken());
			}
		}
		

	}

}

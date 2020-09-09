package api13.Exception;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : 
 */

public class Ex09 {

	public static void main(String[] args) {
		
		try {
		int su=Integer.parseInt(args[0]);
		int value=Integer.parseInt(args[1]);
		
		int div=su/value;
		
		System.out.println(div);
		
		} catch(Exception e) { // (Throwable e) 가능하다.
			System.out.println("에러가 발생했습니다. (숫자, 0, 배열 수 확인)");
		} finally {
			System.out.println("모든 예외 처리를 끝냈습니다.");
		}
		

	}

}

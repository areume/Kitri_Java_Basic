package api13.Exception;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : arguments 의 수가 넘어가는 것은 문제가 안되지만 부족하면 문제가 된다.
 * 
 * 예외 처리 - try catch를 사용하여 에러를 처리하고 가는 것을 말한다.
 */

public class Ex04 {

	public static void main(String[] args) {
	
		try {
			String su=args[0];
			String value=args[1];
			
			System.out.println(su);
			System.out.println(value);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 수가 제대로 입력되지 않았습니다.");
		}
	}

}

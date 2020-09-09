package api13.Exception;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : 1. 정수형을 입력하지 않은 경우 2. 0으로 나누는 경우 3. 배열 수가 안맞는 경우 
 * 
 * Object > Throwable > Exception > IOException / RuntimeException 등 
 */

public class Ex08 {

	public static void main(String[] args) {
		
		try {
		int su=Integer.parseInt(args[0]);
		int value=Integer.parseInt(args[1]);
		
		int div=su/value;
		
		System.out.println(div);
		
		} catch(NumberFormatException e) {
			System.out.println("반드시 정수형을 입력하세요.");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 수를 초과합니다.");
		} finally { // 예외처리를 한 후에 들렸다가 간다...? 정상적으로 실행되도 들렸다 간다. 나중에 진짜 중요한 역할!!!!!!
			System.out.println("모든 예외 처리를 끝냈습니다.");
		}
		

	}

}

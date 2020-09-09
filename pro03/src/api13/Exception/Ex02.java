package api13.Exception;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : 
 */

public class Ex02 {

	public static void main(String[] args) {
		
		String su="100";
		String value="a200";
		
		try {
			int isu=Integer.parseInt(su);
			int ivalue=Integer.parseInt(value);
			
			int result=isu+ivalue;
			System.out.println(result);
			
		}catch(NumberFormatException e) {
			System.out.println("숫자를 정확히 입력하세요");
		}
		
	}

}

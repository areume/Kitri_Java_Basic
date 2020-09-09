package api13.Exception;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : 
 */

public class Ex05 {

	public static void main(String[] args) {
		
		/*
		String data=null;
		System.out.println(data.toString());
		*/
		
		try {
			String data=null;
			System.out.println(data.toString());
		}catch(NullPointerException e) {
			System.out.println("값을 입력하세요.");
		}

	}

}

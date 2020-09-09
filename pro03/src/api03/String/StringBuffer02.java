package api03.String;

/**
 * @author : 김아름
 * @date   : 2020. 5. 13.
 * @description : 
 */

public class StringBuffer02 {

	public static void main(String[] args) {
		
		StringBuffer str=new  StringBuffer("** Java");
		System.out.println("문자열 출력 : "+str);

		str.insert(3,"Good ");
		System.out.println("문자열 삽입 : "+str);
		
		str.setCharAt(1,'$');
		System.out.println("문  자 치환 : "+str);
		
		str.replace(3,7,"Love");
		System.out.println("문자열 치환 : "+str);
		
		str.deleteCharAt(1);
		System.out.println("문  자 삭제 : "+str);
		
		str.delete(7,11);
		System.out.println("문자열 삭제 : "+str);
		
		str.reverse();
		System.out.println("문자열 역순 : "+str);
	}

}

package api07.Date;

/**
 * @author : 김아름
 * @date   : 2020. 5. 14.
 * @description : java.util.Date
 */

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateEx {

	public static void main(String[] args) throws Exception {
		Date date=new Date();
		System.out.println(date.toString()); // Thu May 14 09:23:13 KST 2020 - 기본 format
		
		System.out.println(date.getYear());  	// 년, deprecated - 분리해서 출력하면 정확한 값 안나온다. > Calendar 클래스로 대체되고 있다.
		System.out.println(date.getMonth()+1); 	// 월, deprecated
		System.out.println(date.getDate()); 	// 일, deprecated
		System.out.println(date.getHours());	// 시, deprecated 
		System.out.println(date.getMinutes());	// 분, deprecated
		System.out.println(date.getSeconds());	// 초, deprecated
		System.out.println("=============================");
		// 날짜 연산하는 경우에는 Calendar 클래스를 이용해서 연산한다.
		// 단순히 출력하기 위함이라면 Date 클래스 사용해도 무방.
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yy년 MM월 dd일 E요일");
		System.out.println(sdf2.format(date));
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf3.format(date)); 
		
		SimpleDateFormat sdf4=new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf4.format(date));
		
		System.out.println("=============================");
		
		// 문자를 날짜로 바꾸기.
		String str="1980-12-25";
		Date strDate=sdf1.parse(str);		
		System.out.println(strDate.toString());
		
	}

}

package api06.Quiz;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Quiz21 {

	public static void main(String[] args) {
		
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 E hh시 mm분");
		System.out.println(sdf.format(date));
	}

}

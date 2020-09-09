package api06.Quiz;

import java.text.DecimalFormat;

public class Quiz30 {

	public static void main(String[] args) throws Exception {
		
		String str="123,456,777.5";
		
		DecimalFormat df1=new DecimalFormat("#,###.#");
		Number number=df1.parse(str);
		double value=number.doubleValue();
		
		long roundVal=Math.round(value);
		System.out.println("반올림 : "+roundVal);
		
		DecimalFormat df2=new DecimalFormat("#,###");
		System.out.println("천단위 : "+df2.format(roundVal));
	}

}

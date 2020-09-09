package api07.Date;

/**
 * @author : 김아름
 * @date   : 2020. 5. 14.
 * @description : DecimalFormat
 */

import java.text.DecimalFormat;

public class DecimalEx {

	public static void main(String[] args) throws Exception {
		
		double x=1234567.89;
		
		DecimalFormat d1=new DecimalFormat("0");			// 소수 첫째자리에서 반올림해서 정수자리만 표현
		DecimalFormat d2=new DecimalFormat("0.0");			// 소수 둘째자리에서 반올림.
		DecimalFormat d3=new DecimalFormat("0.0000");		// 소수 빈 자리는 0으로 채운다.
		DecimalFormat d4=new DecimalFormat("0000000.00");
		
		System.out.println(d1.format(x));
		System.out.println(d2.format(x));
		System.out.println(d3.format(x));			
		System.out.println(d4.format(x));
		System.out.println("============================");
		
		DecimalFormat d6=new DecimalFormat("#######.##");
		DecimalFormat d7=new DecimalFormat("#.#");
		DecimalFormat d8=new DecimalFormat("#.####");		// 소수 빈 자리를 0으로 채우지 않는다.
		DecimalFormat d9=new DecimalFormat("#.00");
		
		System.out.println(d6.format(x));
		System.out.println(d7.format(x));
		System.out.println(d8.format(x));			
		System.out.println(d9.format(x));
		System.out.println("============================");
		
		int y=123456789;
		DecimalFormat d10=new DecimalFormat("#,###");			// 세 자리마다 ,로 구분하여 출력한다.
		DecimalFormat d11=new DecimalFormat("#,####");			// 네 자리마다 ,로 구분하여 출력한다.
		DecimalFormat d12=new DecimalFormat("\u00A4 #,###");	// 원화 단위 표시하기. \u00A4
		
		System.out.println(d10.format(y));
		System.out.println(d11.format(y));
		System.out.println(d12.format(y));
		System.out.println("============================");
		
		// 문자 > 숫자
		String str="1,123,456";
		DecimalFormat df=new DecimalFormat("#,###");
		Number num=df.parse(str);
		int value=num.intValue();
		System.out.println(value);
		System.out.println(value+1);
	}

}

package api05.Math;

public class RoundEX {

	public static void main(String[] args) {
		
		double x=123.5672;
		double y=456.4675;
		
		// 반올림
		int a=(int)Math.round(x);
		int b=(int)Math.round(y);
		
		System.out.println("x 반올림 : "+a);
		System.out.println("y 반올림 : "+b);
		System.out.println("==================");
		
		// 무조건 올림 ceil()
		int c=(int)Math.ceil(x);
		int d=(int)Math.ceil(y);
		
		System.out.println("무조건 올림 x : "+c);
		System.out.println("무조건 올림 y : "+d);
		System.out.println("==================");
		
		// 무조건 내림 floor()
		int e=(int)Math.floor(x);
		int f=(int)Math.floor(y);
		
		System.out.println("무조건 내림 x : "+e);
		System.out.println("무조건 내림 y : "+f);
		System.out.println("==================");
		
		// 소수 둘째자리에서 첫째자리까지 표현하는 반올림 연산. 소수점 이하를 나타내고 싶으면 연산을 해야 한다.
		double temp=x*10;
		System.out.println("0. 초기값 :\t"+x);
		System.out.println("1. 곱하기 10 :\t"+temp);
		
		int imsi=(int)Math.round(temp);
		System.out.println("2. 반올림 :\t"+imsi);
		
		double r=imsi/10.0;
		System.out.println("3. 나누기 :\t"+r);
		
		System.out.println("==================");
		double first=Math.round(x*10)/10.0;
		System.out.println("첫째자리 까지 반올림 : "+first);
		double second=Math.round(x*100)/100.0;
		System.out.println("둘재자리 까지 반올림 : "+second);
		double third=Math.round(x*1000)/1000.0;
		System.out.println("셋째자리 까지 반올림 : "+third);
		
		// 무조건 올림, 내림 연산은 round 메소드 대신 ceil, floor 메소드를 사용하면 된다.
		System.out.println("==================");
		double res1=Math.ceil(x*100)/100.0;
		System.out.println("무조건 올림 : "+res1);
		double res2=Math.floor(x*100)/100.0;
		System.out.println("무조건 내림 : "+res2);
	}

}

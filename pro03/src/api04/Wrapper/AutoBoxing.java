package api04.Wrapper;

/**
 * @author : 김아름
 * @date   : 2020. 5. 13.
 * @description : Wapper 클래스 : 기본 타입 (byte ~~ double, boolean) 값을 포장하는 클래스.
 * 							       즉, 기본 자료형을 클래스로 제공.
 * 							String은 자동으로 Boxing 되는 것이다!!!!!!!
 * 
 */

public class AutoBoxing {

	public static void main(String[] args) {
		
		// Boxing, UnBoxing
		int value1=10;
		Integer obj=value1;	// AutoBoxing, int 변수를 Integer 클래스 객체에 담아줄 수 있다. > 클래스의 메소드 사용할 수 있다.
		System.out.println(obj.toString());
		
		int value2=obj;		// AutoUnBoxing, Integer 클래스 객체를 int 변수에 담아줄 수 있다.
		System.out.println(value2);
		
		int sum=obj+100;	// AutoUnBoxing을 통해 int 변수로 바꾸고 연산하여 담아준다.
		System.out.println(sum);
		System.out.println("==========");
		
		Integer a=20;		// AutoUnBoxing : -128~127 값이 들어오면 주소값을 공유해서 사용한다. new 키워드로 객체를 생성하지 않는다.
		Integer b=20;		// AutoUnBoxing : a=0x100, b=0x100
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println("==========");
		
		Integer c=300;						// Integer c=new Integer(300);
		Integer d=300;						// Integer d=new Integer(300);
		System.out.println(c==d);			// -128~127 범위를 넘어가므로 주소값 비교가 실행된다.
		System.out.println(c.equals(d));
		
		
		
	}

}

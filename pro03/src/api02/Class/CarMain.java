package api02.Class;

/**
 * @author : 김아름
 * @date   : 2020. 5. 12.
 * @description : java.lang.Class
 * 
 * Class 클래스 : 동적객체 생성 시 사용. 클래스 이름, 필드정보, 메소드 정보
 * 
 */

public class CarMain {

	public static void main(String[] args) throws Exception {
		
		Car car1=new Car("르반떼","아름");
		System.out.println(car1.toString());
		System.out.println(car1.getModel()+"\t"+car1.getOwner());
		
		Car car2=new Car();
		car2.setModel("카이엔");
		car2.setOwner("아름");
		System.out.println(car2.toString());
		System.out.println(car2.getModel()+"\t"+car2.getOwner());
		
		
		// 동적 객체 생성 - 풀 패키지명이 문자열로 넘어온다.
		String str="api02.Class.Car";
		Class<?> cls=Class.forName(str);								// 넘어온 풀 패키지명에서 클래스 받아오기.
		Car obj=(Car)cls.getDeclaredConstructor().newInstance();		// Object 객체를 반환해준다. deprecation은 컴파일되지만 사용하지 말라는 의미.
		
		obj.setModel("카이엔");				// 이 경우 생성자를 통해서 필드를 초기화해 줄 수 없다.
		obj.setOwner("아름");					// 생성자보다 메소드를 통해 초기화해주게 되는 이유가 된다.
		System.out.println(obj.toString());
		System.out.println(obj.getModel()+"\t"+obj.getOwner());
			
		System.out.println("======================");
		Class<?> a=car1.getClass();
		System.out.println(a.getName());
		System.out.println(a.getSimpleName());
		System.out.println(a.getPackageName());
		System.out.println("======================");
	}

}

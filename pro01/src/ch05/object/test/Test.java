package ch05.object.test;

public class Test {
	private String name;
	private int age;
	private float ki;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getKi() {
		return ki;
	}
	public void setKi(float ki) {
		this.ki = ki;
	}
	
	// private으로 선언한 멤버 변수를 설정하고, 접근하기 위한 함수. >> setter, getter 자동으로 제공해준다.
	// 마우스 우클릭 > Source > Generate Getters and Setters ... 클릭해서 필요한 것 체크하고 generate.
	
	
	
	
}
package ch00.quizInheritance;

class Student {
	protected int hakbunho;
	protected String name;
	protected String major;
}

class StudentAddress extends Student {
	private String phone;
	private String addr;
	
	public StudentAddress() { }
	
	public StudentAddress(int hakbunho, String name, String major, String phone, String addr) {
		super.hakbunho=hakbunho;
		super.name=name;
		super.major=major;
		
		this.phone=phone;
		this.addr=addr;
	}
	
	public void disp() {
		System.out.println("학번\t: "+hakbunho+"\n이름\t: "+name+"\n학과\t: "+major);
		System.out.println("전화번호\t: "+phone+"\n주소\t: "+addr);
	}
}

public class Quiz29 {
	public static void main(String[] args) {
		StudentAddress s=new StudentAddress(123456,"홍길동","소프트웨어","010-1234-5678","서울시 강남구");
		s.disp();
	}
}

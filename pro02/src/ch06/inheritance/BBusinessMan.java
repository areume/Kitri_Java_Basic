package ch06.inheritance;

public class BBusinessMan extends BMan{
	private String company;
	private String position;
	
	public BBusinessMan() {}
	
	public BBusinessMan(String name, String company, String position) {
		super.name=name;
		this.company=company;
		this.position=position;
	}
	
	public void info() {
		empName(); 			// super.empName(), this.empName()
		System.out.println("회사 : "+company);
		System.out.println("직군 : "+position);
	}
}

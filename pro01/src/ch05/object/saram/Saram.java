package ch05.object.saram;

public class Saram {
	private String name;
	public String address;
	public String phoneNumber;
	public String juminBunho;
	
	public void input(String n, String a, String p, String j) {
		name=n;
		address=a;
		phoneNumber=p;
		juminBunho=j;
	}
	
	public void output() {
		System.out.print(name+"\t"+address+"\t"+phoneNumber+"\t"+juminBunho+"\n");
	}
	
}


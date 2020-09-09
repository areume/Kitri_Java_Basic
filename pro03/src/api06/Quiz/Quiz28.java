package api06.Quiz;

public class Quiz28 {
	public static void main(String[] args) {
		
		String fullPath="c:\\jdk1.5\\work\\PathSeparateTest.java";
		
		int start=fullPath.indexOf("Path");
		System.out.println(fullPath.substring(start));
		
		int pos=fullPath.lastIndexOf("\\")+1;
		System.out.println(fullPath.substring(pos));
	}
}

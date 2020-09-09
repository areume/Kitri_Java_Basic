package api04.Wrapper;

public class Function {

	public static void main(String[] args) {
		int max=Integer.MAX_VALUE;	// static 변수
		int min=Integer.MIN_VALUE;
		int byteSu=Integer.BYTES;
		int size=Integer.SIZE;
		
		System.out.println("MAX : "+max);
		System.out.println("MIN : "+min);
		System.out.println("byteSu: "+byteSu);
		System.out.println("SIZE : "+size);
		
		System.out.println("=================");
		String binary=Integer.toBinaryString(10);	// 2진수로 변환한 값을 문자열로 저장.
		String octal=Integer.toOctalString(10);
		String hex=Integer.toHexString(10);
		System.out.println("binary : "+binary);
		System.out.println("octal : "+octal);
		System.out.println("hex : "+hex.toUpperCase());
		
		// 문자를 숫자로 바꾸기
		System.out.println("=================");
		String value="10";
		int avalue=Integer.parseInt(value);
		byte bvalue=Byte.parseByte(value);
		long cvalue=Long.parseLong(value);
		System.out.println(avalue);
		System.out.println(bvalue);
		System.out.println(cvalue);
		
		// 숫자를 문자로 바꾸기
		System.out.println("=================");
		int su=10;
		String str=String.valueOf(su);
		System.out.println(str);
		
	}

}

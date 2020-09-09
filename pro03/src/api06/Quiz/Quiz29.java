package api06.Quiz;

public class Quiz29 {

	public static void main(String[] args) {
		
		String str="1!2@3^4~5";
		String delStr="!@^~";	
		String sub="";
		
		int start=0;
		int end=0;
		
		for(int i=0;i<delStr.length();i++) {
			
			end=str.indexOf(delStr.charAt(i));
			if(end==-1) continue;
			sub+=str.substring(start, end);
			start=end+1;	
		}
		// start 마지막 아니라면
		if(start!=str.length()) {
			sub+=str.substring(start);
		}
		System.out.println(sub.toString());
		
		// StringBuffer 사용
		StringBuffer sb=new StringBuffer();
		
		int pos=-1;
		
		for(int i=0;i<delStr.length();i++) {
			
			pos=str.indexOf(delStr.charAt(i));
			
			if(pos==-1) continue;
			
			sb.append(str.substring(pos-1, pos));
		}
		if(pos!=str.length()) {
			sb.append(str.substring(pos+1));
		}
		System.out.println(sb.toString());
		
	}
}

package ch06.inheritance;

public class CExam {

	public static void main(String[] args) {
		CaptionTV ctv=new CaptionTV(true,11,true);
		ctv.channelUp();
		ctv.display("캡쳐 화면을 보여줍니다.");
		
		CaptionTV ct=new CaptionTV(true,7,false);
		ct.channelDown();
		ct.display("캡쳐 화면을 보여줍니다.");
	}

}

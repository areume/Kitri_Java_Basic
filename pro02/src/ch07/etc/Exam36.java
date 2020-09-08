package ch07.etc;

/**
 * @author : 김아름
 * @date   : 2020. 5. 11.
 * @description : 의존관계
 */

class Sungjuk {
	private String name;
	private int kor, eng, mat;
	
	public Sungjuk() { }

	public Sungjuk(String name, int kor, int eng, int mat) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
		
	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public void disp() {
		System.out.print(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t");
	}
}

class SungjukTotal {
	private int tot;
	
	public void setTotal(Sungjuk sungjuk) {
		tot=sungjuk.getKor()+sungjuk.getEng()+sungjuk.getMat();
		
		sungjuk.disp();
		System.out.println("tot : "+tot);
	}
}

public class Exam36 {

	public static void main(String[] args) {
		Sungjuk hong=new Sungjuk("홍길동",70,70,70);
		SungjukTotal h=new SungjukTotal();
		h.setTotal(hong);
		System.out.println();
		Sungjuk lee=new Sungjuk("이영자",60,60,60);
		SungjukTotal l=new SungjukTotal();
		l.setTotal(lee);
	}

}

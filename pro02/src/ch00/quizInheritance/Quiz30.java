package ch00.quizInheritance;

class CDInfo {
	protected int managerNum;
	
	public int getManagerNum() {
		return managerNum;
	}
	
	public void setManagerNum(int managerNum) {
		this.managerNum=managerNum;
	}
}

class Music extends CDInfo {
	protected String artist;
	protected String[] song;
	
	public void setArtist(String artist) {
		this.artist=artist;
	}
	
	public void setSong(String[] song) {
		this.song=song;
	}
	
	public void disp() {
		System.out.println("관리자번호\t: "+managerNum);
		System.out.println("가수\t: "+artist);
		
		for(int i=0;i<song.length;i++) {
			System.out.println("히트송["+(i+1)+"]\t: "+song[i]);
		}
	}
}

public class Quiz30 {
	public static void main(String[] args) {
		Music m=new Music();
		m.setManagerNum(123456);
		m.setArtist("플라이 투 더 스카이");
		
		String[] song= {"너를 너를 너를","전화하지 말아요"};
		m.setSong(song);
		
		m.disp();
		
	}
}

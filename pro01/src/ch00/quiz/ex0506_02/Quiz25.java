package ch00.quiz.ex0506_02;

/**
 * @author : 김아름
 * @date   : 2020. 5. 7.
 * @description : 
 */

class Song {
	private String title;
	
	public Song() {
	}
	
	public Song(String title) {
		this.title=title;
	}
	
	public String getTitle() {
		return title;
	}
}

public class Quiz25 {

	public static void main(String[] args) {
		Song mySong=new Song("Let it go");
		Song yourSong=new Song("강남스타일");
		
		System.out.println("내 노래는 "+mySong.getTitle());
		System.out.println("너 노래는 "+yourSong.getTitle());
	}

}

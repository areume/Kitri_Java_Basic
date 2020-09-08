package ch00.quiz.ex0506_02;

import java.util.Scanner;

/**
 * @author : 김아름
 * @date   : 2020. 5. 7.
 * @description : 
 */

class Sungjuk {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private float avg;
	
	private Scanner sc;
	
	private static int banTot;
	private static float banAvg;
	private static int inwon;
	
	public Sungjuk() {
		sc=new Scanner(System.in);
		
		if(inwon==0) {
			System.out.print("인원 수를 입력 : ");
			inwon=sc.nextInt();
			System.out.println();
		}
		
		System.out.print("이름 : ");
		name=sc.next();
				
		System.out.print("국어 : ");
		kor=sc.nextInt();
				
		System.out.print("영어 : ");
		eng=sc.nextInt();
				
		System.out.print("수학 : ");
		mat=sc.nextInt();
			
		System.out.println();
	}
	
	public void total() {
		tot=kor+eng+mat;
	}
	
	public void average() {
		avg=(float)tot/3;
	}
	
	public void banTotal() {
		banTot+=tot;
	}
	
	public void banAverage() {
		banAvg=(float)(banTot/3.0f)/inwon;
	}
	
	public void disp() {
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
	}
	
	public static void title() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
	}
	
	public static void banDisp() {
		System.out.println("=============================================");
		System.out.println("반총점 : "+banTot+"  반평균 : "+banAvg+"  인원수 : "+inwon);
	}
}

public class Quiz30 {
	
	public static void main(String[] args) {
		Sungjuk kim=new Sungjuk();
		Sungjuk park=new Sungjuk();
	
		kim.total();
		kim.average();
		kim.banTotal();
		
		park.total();
		park.average();
		park.banTotal();
		
		park.banAverage();
		
		Sungjuk.title();
		kim.disp();
		park.disp();
		
		Sungjuk.banDisp();

	}

}

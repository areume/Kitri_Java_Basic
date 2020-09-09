package api05.Math;

import java.util.Arrays;

public class RandomEX {

	public static void main(String[] args) {
		
		// abs는 절대값 출력.
		System.out.println("절대값 : "+Math.abs(-10));
		System.out.println("최대값 : "+Math.max(10,30));
		System.out.println("최소값 : "+Math.min(1.5,1.3));
		System.out.println("2의 3승 : "+(int)Math.pow(2,3));
		System.out.println("=================");
		
		// Random : random 메소드는 0~1 사이의 랜덤 소수. 보통 정수를 곱해서 사용한다.
		int random=(int)(Math.random()*10);	// 0~9 하나의 수가 반환된다.
		System.out.println("랜덤 : "+random);

		// 당첨자
		String[] array=new String[] {"김경은","지명관","최정윤","장경민","임정민","유승아","진영수"};
		int index=(int)(Math.random()*array.length);	// 배열의 길이만큼 곱해서 그 사의 값만 나오도록 한다.
		System.out.println("사다리 : "+array[index]);
		
		// 주사위
		int num=(int)(Math.random()*6)+1;	// 1~6 중 반환.
		System.out.println("주사위 눈 : "+num);
		
		// 로또
		int[] selectNumber=new int[6];
		for(int i=0;i<selectNumber.length;i++) {
			selectNumber[i]=(int)(Math.random()*45)+1;
		}
		for(int i=0;i<selectNumber.length;i++) {
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();	
		
		// 정렬
		Arrays.sort(selectNumber);
		System.out.println(Arrays.toString(selectNumber));
		System.out.println("=================");
		
		// 심화 로또
		int[] select=new int[6];
		int[] machine=new int[6];
		
		while(true) {
			
			for(int i=0;i<select.length;i++) {
				select[i]=(int)(Math.random()*45)+1;
			}
			
			for(int i=0;i<machine.length;i++) {
				machine[i]=(int)(Math.random()*45)+1;
			}
			
			boolean result=Arrays.equals(select, machine);
			
			if(result) {
				Arrays.sort(select);
				break;
			}
		}
		System.out.println(Arrays.toString(select));
	}

}

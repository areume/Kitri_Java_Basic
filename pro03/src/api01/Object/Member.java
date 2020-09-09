package api01.Object;

/**
 * @author : 김아름
 * @date   : 2020. 5. 11.
 * @description : 
 */

public class Member {
	private String id;
	private String pw;
	
	public Member(String id, String pw) {
		this.id=id;
		this.pw=pw;
	}

	@Override
	public boolean equals(Object obj) { // ctrl+space bar 눌러서 equals 선택해 오버라이드 하기.
		System.out.print("equals 오버라이딩 > ");
		if(obj instanceof Member) {
			Member mEq=(Member)obj;		// 업 캐스팅 된것을 다시 다운 캐스팅
			
			if(this.id.equals(mEq.id) && this.pw.equals(mEq.pw)) {
				return true;
			}
		}
		return false;
	}

	
	@Override
	public String toString() {
		return id+" "+pw;
	}
	
	
}

// kim.equals(lee)
// obj에 lee가 담긴다. lee가 Member의 인스턴스라면 비교 연산 진행.
// this는 kim을 가리킨다.
// kim이 가진 필드와 lee가 가진 필드를 비교하는 연산 진행.
package thread01.Basic;

public class Ex02 {

	public static void main(String[] args) {
		
		SubThread st=new SubThread();
		st.start();
		
		InputThread it=new InputThread();
		it.start();

	}

}

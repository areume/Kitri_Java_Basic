package thread09.Notify;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : 
 */

public class Ex01 {

	public static void main(String[] args) {
		
		WorkData data=new WorkData();
		
		HongConsumer a=new HongConsumer(data);
		a.setName("a");
		HongConsumer b=new HongConsumer(data);
		b.setName("b");
		ChoSupplier x=new ChoSupplier(data);
		x.setName("x");
		ChoSupplier y=new ChoSupplier(data);
		y.setName("y");
		
		a.start();
		b.start();
		x.start();
		y.start();
	}

}

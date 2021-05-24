package performingencapsulation;

public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bmw b1 = new bmw();
		b1.start();

	}

}
abstract class car{
	int price;
	abstract void start();

}

class audi extends car{

	@Override
	void start() {
		System.out.println("Audi is Starting");
		// TODO Auto-generated method stub
		
	}
	
}
class bmw extends car{

	@Override
	void start() {
		System.out.println("BMW is Starting at Rs "+price);// TODO Auto-generated method stub
		
	}

}

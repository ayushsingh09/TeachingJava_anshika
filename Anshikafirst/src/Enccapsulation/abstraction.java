package Enccapsulation;

public class abstraction {
	
	// abstraction can be performeed by 2 ways - 'abstract keyword' and 'interface'.
	
	// if a function is abstracted, that function cannot be implemented and cannot have a body.
	// but their implementTION or definition(body) can be given by their same function in their inherited classes.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		audi a1 = new audi();
		a1.start();

	}

}
abstract class car{
	int price;
	abstract void start();
}

class audi extends car{

	@Override
	void start() {
		System.out.println("audi is starting");
		// TODO Auto-generated method stub
		
	}
	
}
class bmw extends car{

	@Override
	void start() {
		System.out.println("bmw is starting");
		// TODO Auto-generated method stub
		
	}
	
}
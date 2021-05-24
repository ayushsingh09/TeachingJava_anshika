package Enccapsulation;

public class fuck {

	//abstraction (not only this such as multiple inheritance.)
	//By default al the function are 'public' and 'abstracted'
	// no function body
	// in the concept of inheritance, we replace the word 'extends' with 'implements'.


	public static void main(String[] args) {
		
		HR h1 = new HR();
		h1.comp();
		h1.pack();
		
	}

	
	
}
interface Company {
	void comp();
}

interface Package {
	void pack();
}

class HR implements Company, Package{
	@Override
	public void pack() {
		System.out.println("My package is ready");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comp() {
		// TODO Auto-generated method stub
		System.out.println("My pack");
		
	}
	
}

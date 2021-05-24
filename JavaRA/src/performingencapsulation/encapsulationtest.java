package performingencapsulation;

import java.util.Scanner;

public class encapsulationtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=18;
		encapsulationtest t1 = new encapsulationtest();
		t1.callkarlo(a);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name ");
		String n= sc.nextLine();
		laptop l1 = new laptop();
		l1.setPrice(123, n);
		
		
		
		
				
	}
	public void callkarlo(int age) {
		System.out.println("Your age :"+age);
	}

}

class laptop{
	String name = "Admin";
	private int price;
	
	void setPrice(int p, String na) {
		if(na == this.name) {
			this.price= p;
			System.out.println("New price"+p);
		}
		else
			System.out.println("You can't change it");
	}
}

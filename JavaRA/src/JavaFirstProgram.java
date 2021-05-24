import java.util.Scanner;

import performingencapsulation.encapsulationtest;

public class JavaFirstProgram {

	public static void main(String[] args) {
		
		/*
		 * int a =32768; String b = "Ayush"; a++; boolean catur = true;
		 */
		/*
		 * int a = 1; System.out.println(a++); int b = a+1; double c = (double)(a+b);
		 * System.out.println(b); System.out.println(c);
		 */
		/*System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println(catur);*/
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter Please :");
		 * int a = sc.nextInt(); float z = sc.nextFloat(); sc.nextLine(); String name =
		 * sc.nextLine(); String c = sc.next(); int ay = sc.nextInt(); String as =
		 * sc.nextLine(); //char c = sc.next(); System.out.println("Hey : "+a);
		 * System.out.println("There : "+z); System.out.println(name);
		 * System.out.println(c); System.out.println(ay); System.out.println(as);
		 * //System.out.println(c);
		 */	
		/*
		 * int a =5, b= 7; if(a<b) { System.out.println(a+1); } else {
		 * System.out.println(b-1); }
		 */
		/*
		 * if(!(2<3)) System.out.println(18<3); else System.out.println("Bye");
		 
		 */
		/*
		 * for(int i=0;i<10;i++) { System.out.println("i = "+i); }
		 */
		/*
		 * int a =1; do { a++; System.out.println(a+1); }while(a<5);
		 */
		/*int r, n, num,c,sum=0;
		Scanner sc= new Scanner(System.in);
		num = sc.nextInt();
		n=num;*/
		/*
		 * while(num!= 0) { r= num%10; rev=rev*10+r; num=num/10; } if(rev==n)
		 * System.out.println("Palindrome"); else
		 * System.out.println("Not a Palindrome");
		 */
		/*
		 * while(num!=0) { r=num%10; c=r*r*r; sum = sum + c; num =num /10; } if(n==sum)
		 * { System.out.println("Armstrong"); } else
		 * System.out.println("Not an armstrong");
		 */
		/*
		 * int i,j; for(i=0;i<5;i++) { for(j=0;j<=i;j++) { System.out.print("*"); }
		 * System.out.println("\n"); }
		 */
		
		/*
		 * int a[]= {1,2,3}; try { System.out.println(2/0); } catch
		 * (ArrayIndexOutOfBoundsException e ) { System.out.println("Error aya tha");
		 * System.out.println(e.getLocalizedMessage()); } catch (ArithmeticException e )
		 * { System.out.println("Error aya tha");
		 * System.out.println(e.getLocalizedMessage()); } catch (Exception e ) {
		 * System.out.println("Error aya tha");
		 * System.out.println(e.getLocalizedMessage());
		 * System.out.println("neeche ki line");
		 */
		/*
		 * person p1 = new person(); person p2 = new person();
		 */		person p3 = new person("Swapnil", 18);
		p3.name="Swapnil";
		p3.walk();
		
		/*
		 * p1.name = "Ayush"; p2.name = "anshika"; p2.age= 20; p1.age = 21; p1.walk();
		 * p2.eat(); p2.eat(6);
		 */
		 
		System.out.println(person.count);
		
		Developer d1 = new Developer("Ranbeer", 21);
		d1.walk();
		encapsulationtest t2 = new encapsulationtest();
		t2.callkarlo(21);
	}

}
class person{
	protected String name = "Ayu";
	private int age;
	static int count;

	/*
	 * public person() { this("Sarthak", 21); count++;
	 * 
	 * System.out.println("I will run"); }
	 */
	public person(String name, int age) {
		//count++;
		
		 this.name = name; this.age = age;
		 
		//this();
		System.out.println("swapnil's name = "+name+" & his age is "+age);
	}
	
	void walk() {
		System.out.println(name+" is walking");
	}
	void eat() {
		System.out.println(name+" is eating and hes age is "+age);
	}
	void eat(int tofees) {
		System.out.println(name+" is eating and hes age is "+age+" she has "+tofees+" toffees");
	}
}

class Developer extends person {
	
		// TODO Auto-generated constructor stub
	}

	 
	 void walk(){ System.out.println("No developer will walk");
	 
	 }
	 

}













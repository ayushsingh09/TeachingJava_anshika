import java.util.Scanner;

import Enccapsulation.Encap;

public class Anshikafirstprogram {

	public static void main(String args[]) {
		/*
		 * ayush a1 = new ayush(); a1.ayu(7); ayush a2 =new ayush(); a2.ayu(7);
		 * System.out.println(ayush.ayu(5));
		 */
		/*
		 * System.out.print("Anshika"); System.out.print(2); System.out.println();
		 */
		/*
		 * boolean b = false; //initialization int a; // declaration a=1; // assigning
		 * // float< double float f = 0.9f; // int < long long l = 78l;
		 * 
		 * //char a[5]= "Ayush"; char a = 'B'; String s = "Anshika";
		 */
		// +,-,*,%,++,--,/ Arithmetic Operators

//		int a = 5;
//		int b = 2;
//		float c = (float)a / (float)b;
//		System.out.println(c);
		// User Input // void ayush(int a){}
		// in C: ayush.obj1;
		// in Java : ayush obj1 = new ayush();
		// Classname objname = new Classname();

		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("Enter");
		 * 
		 * int a = sc.nextInt(); float b = sc.nextFloat(); sc.nextLine(); String s =
		 * sc.nextLine();
		 * 
		 * char a = sc.next(); System.out.println("Anshika was born on " + a +
		 * " september, "+b); System.out.print("Anshika "+s);
		 */
		/*
		 * Scanner sc = new Scanner(System.in); int a = sc.nextInt(); int b =
		 * sc.nextInt(); if (a>b) { System.out.println(a); } else int a = sc.nextInt();
		 * //1 float b = sc.nextFloat(); //2.0 sc.nextLine(); //Linepoori String c =
		 * sc.nextLine();
		 * 
		 * 
		 */

		/*
		 * System.out.print("Choose 1 -  Ayush ,  2 - Anshika, 3- Swap"); Scanner sc =
		 * new Scanner(System.in); int a = sc.nextInt(); sc.nextLine(); String b =
		 * sc.nextLine();
		 * 
		 * switch(a) { case 1: System.out.println("Ayush"); break; case 2:
		 * System.out.println("Anshika"); break; case 3: System.out.println("Swap");
		 * break; default: System.out.print("MA chuda"); break; }
		 * 
		 * System.out.println(b); //System.out.println(c);
		 */
		// for, while, do while
		// 121
		/*
		 * int d, rev=0, q; Scanner sc = new Scanner(System.in); int n = sc.nextInt();
		 * q=n;
		 * 
		 * while( n!=0 ) { d = n%10; // 1|2|1 rev = 10*rev + d; // 1|12|121 n = n/10;
		 * //12|1|0
		 * 
		 * } if(q == rev) System.out.println("Palindrome"); else
		 * System.out.println("Not");
		 */
		// 1/1! + 2/2! +..........n/n! , fibonnaci
		// pattern looping

		// cel to fahr
		// (swtich case)

		// armstrong, factorial,

		// Scanner sc =new Scanner(System.in);
		// classname obj1;
		// int a[3];

		// int a[]= new int[5];
		// initialization
		/*
		 * int marks[]= {1,2,3,4,5}; for(int i = 0; i<marks.length; i++) {
		 * System.out.println(marks[i]); }
		 */
		/*
		 * int marks[][]= new int[2][3]; int i,j; Scanner sc = new Scanner(System.in);
		 ÷* 
		 * 
		 * for(i=0; i<; i++) {
		 * System.out.println("Enter your marks in "+(i+1)+" subject"); marks[i] =
		 * sc.nextInt(); }
		 * 
		 * for(i=0; i<2;i++) { for(j=0;j<3;j++) { marks[i][j] = sc.nextInt(); } }
		 * 
		 * 
		 * 
		 * 
		 * for(i=0; i<2;i++) { for(j=0;j<3;j++) { System.out.println(marks[i][j]); } }
		 */
		/*
		 * int a[][]= { {2,3}, {3,4}, {1,2}
		 * 
		 * };
		 */
		
		// returntype functionname (arguments)
		/*int a[] = {1,2,3,4,5};
		try {
		System.out.println(a[6]);
		}
		catch( Exception e) {
			System.out.println("Error aya tha");
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println(a[2]);
 b
	}*/
		Person p1 = new Person(5, "Shelby" );
		//Person p2 = new Person();
		
		p1.age = 12;
		//p1.name = "Anaaaaaaaaaaaaaaa";
		//p2.name = "Ayush";
	   // p2.eat();
		p1.walk();
		p1.walk(5);
		System.out.println(Person.count);
		developer d1 = new developer();
		d1.age=12;
		
		intern i1 = new intern();
	
		Encap e1 = new Encap();
		e1.sleep();
		
		
	}
}
	
class Person
{
	String name = "anshika";  		//properties
	protected int age =2;//properties
	static int count=0;	
	Person(){
		//this(100);
		count++;
		System.out.println(count+" Times");
	}
	Person(int age, String name){
		 this.age = age;
		 this.name = name;
		System.out.println("My age is "+ age+ " & Imm fucking "+name);
		
	}
	
	
	
	//Behaviour
	void walk() {
		System.out.println("Person with "+age+" is walking");
		System.out.println(name);
	}
	void eat()
	{
		System.out.println("Person is eating");
	}	
	void walk(int steps) {
		System.out.println("Steps in walking "+steps);
	}
	
}
class developer extends Person{

//	developer(int age, String name) {
//		super(age, name);
//		// TODO Auto-generated constructor stub
//		
	void work(){
		System.out.println("My work is done ");
	}
	public void walk(double steps) {
		System.out.println("I walked "+ steps+ " and covered ");
	}
	
}

// Multilevel, Hybrid, Multiple, single, heirchical,

class intern {
	
	void ayush() {
		System.out.println("Are you fine with the code?");
	}
}





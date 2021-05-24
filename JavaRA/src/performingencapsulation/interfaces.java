package performingencapsulation;

public class interfaces implements CCompany, PPackage{

	public static void main(String[] args) {
		interfaces i1 = new interfaces();
		i1.company();
		i1.packages();
		// TODO Auto-generated method stub
	}
	@Override
	public void packages() {
		// TODO Auto-generated method stub
		System.out.println("Anshika is placed in TCS ");
	}

	@Override
	public void company() {
		// TODO Auto-generated method stub
		System.out.println("with a package of 12000000");
	}

}
	
interface CCompany{
	void company();
}
interface PPackage{
	void packages();
}
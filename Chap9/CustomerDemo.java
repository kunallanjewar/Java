
public class CustomerDemo
{

	public static void main(String[] args) 
	{
		Customer ySam = new Customer("Yosemite Sam", "C145",true);
		System.out.println (ySam);

		Customer mMartian = new Customer("Marvin Martian", "C217",false);
		System.out.println (mMartian);		


		PlatinumCustomer wCoyote = new PlatinumCustomer(1750,"Wyle Coyote", "P127", true);
		System.out.println (wCoyote);

		System.out.println("");

		PlatinumCustomer eFudd = new PlatinumCustomer(2100,"Edmur Fudd", "P232", true);
		System.out.println (eFudd);
	}
}
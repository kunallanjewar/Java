
public class CustomerD {

	public static void main(String[] args){
		
		Customer obj1 = new Customer ("Sam", "D12", true);
		System.out.println(obj1);
		
		Customer obj2 = new Customer ("Tom", "D14", false);
		System.out.println(obj2);
		
		SCustomer obj3 = new SCustomer(1750,"John", "P127", true);
		System.out.println(obj3);
		
		SCustomer obj4 = new SCustomer(2100,"Mike", "P232", true);
		System.out.println(obj4);
		
	}
}

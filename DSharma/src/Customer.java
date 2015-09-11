
public class Customer {
	private String Name;
	private String CustomerNumber;
	private boolean Active;
	
	//constructor
	public Customer(String Name, String CustomerNumber, boolean Active)
	{
		this.Name = Name;
		this.CustomerNumber = CustomerNumber;
		this.Active = Active;	
	}
	
	//Setters
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public void setCustomerNumber(String CustomerNumber)
	{
		this.CustomerNumber = CustomerNumber;
	}
	
	public void setActive(boolean Active)
	{
		this.Active = Active;
	}

	//getters
	
	public String getName()
	{
		return Name;
	}
	
	public String getCustomerNumber()
	{
		return CustomerNumber;
	}
	
	public boolean isActive()
	{
		return Active;
	}
	
	public String toString()
	{
		if(Active==false)
		{
			String str1 = "Name: "+ Name + "\n"  + "Customer Number: " + CustomerNumber + "\n" + "Active Customer: " + "No" + "\n";
			return str1;
		}
		else if(Active==true)
		{
			String str2 = "Name: "+ Name + "\n"  + "Customer Number: " + CustomerNumber + "\n" + "Active Customer: " + "Yes" + "\n";
			return str2;
		}
		return toString();
	}
	
}

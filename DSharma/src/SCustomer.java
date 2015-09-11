import java.text.NumberFormat;


public class SCustomer extends Customer {
	
	double discount1 = 0.01;
	double discount2 = 0.05;
	double Amount, Discount=0;
	
	public SCustomer(double Amount, String name, String customerNumber, boolean active)
	{
		super(name, customerNumber, active);
		this.Amount = Amount;
	}
	
	public double getAmount()
	{
		return Amount;
	}
	
	public double getDiscount()
	{
		if(Amount>=500 && Amount<=2000)
		{
			Discount = discount1;
		}
		else if(Amount>2000 && Amount <=10000)
		{
			Discount = discount2;
		}
		
		return Discount;
	}
	
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		String Result =  super.toString() + "Purchases: "+ fmt.format(getAmount()) + "\n" + "Discount Level: " + getDiscount();
		return Result;
	}
	

}

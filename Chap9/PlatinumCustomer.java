import java.text.NumberFormat;

public class PlatinumCustomer extends Customer
{
	double Amount;
	double DiscountLevel1 = 0.05;
	double DiscountLevel2= 0.1;

	public PlatinumCustomer (double Amount,String name, String customerNumber, boolean Aactive)
	{
		super (name, customerNumber, Aactive);
		this.Amount = Amount;
	}
	
	public double getDiscount()
	{
		double Discount = 0;
		if ((Amount >= 500) && (Amount <2000))
			Discount = DiscountLevel1;
		else if (Amount >= 2000)
			Discount = DiscountLevel2;
		return Discount;
	}
	
	public double getAmount()
	{	
		return Amount;
	}

	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		String Result =  super.toString() + "Purchases: "+ fmt.format(getAmount()) + "\n" + "Discount Level: " + getDiscount();
		return Result;
	}

}

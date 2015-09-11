import java.text.NumberFormat;

public class Electronics 
{
	private String Manufacturer; 
	private double Price; 
	private double Weight;

	public Electronics (String Manufacturer, double Price, double Weight) 
	{ 
		this.Manufacturer = Manufacturer; 
		this.Price = Price;
		this.Weight = Weight;
	} 

	public double Rebate()
	{
		return (Price*.1);
	}
	public String toString()
	{ 
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		return "Manufacturer: "+ Manufacturer + "\n"  + "Price: " + fmt.format(Price) + "\n" + "Weight: " + Weight + " pounds"+ "\n" + "Rebate: " + fmt.format(Rebate());
	}

} 




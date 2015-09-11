
public class Cellphone extends Electronics
{
	String Number;

	public Cellphone (String Manufacturer, double Price, double Weight, String Number)
	{
		super ( Manufacturer, Price, Weight);
		this.Number = Number;
	}
	
	public double Rebate()
	{
		return (0.0);
	}

	public String toString()
	{		
		return "\n\nCell Phone \n\n" + super.toString() + "\n" + "Number: " + Number;
	}
}
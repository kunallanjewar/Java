public class Computer extends Electronics
{
	boolean Wireless;

	public Computer (String Manufacturer, double Price, double Weight, boolean Wireless)
	{
		super ( Manufacturer, Price, Weight);
		this.Wireless = Wireless;
	}
	
	public String toString()
	{ 
		if (Wireless == false)
		{
			String Result2 =  "Desktop Computer" + "\n\n" + super.toString() + "\n" + "Wireless is not included.";
			return Result2;
		}
		else
		{
			String Result3 =  "Desktop Computer" + "\n\n" + super.toString() + "\n" + "Wireless is included.";
			return Result3;
		}
	}
}
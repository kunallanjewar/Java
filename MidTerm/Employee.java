import java.text.NumberFormat;


public class Employee 
{
	
	private String _Id, _Name;
	private double _Hours, _PayRate;
	
	NumberFormat fmt = NumberFormat.getCurrencyInstance();

	
	public Employee()
	{
		;
	}
	
	public Employee(String ID, String Name, Double Hours, Double PayRate)
	{
		_Id = ID;
		_Name = Name;
		_Hours = Hours;
		_PayRate = PayRate;
	}
	
	//Setter
	public void setIdNumber(String ID)
	{
		_Id = ID;
	}
	
	public void setName(String Name)
	{
		_Name = Name;
	}
	
	public void setHours(Double Hours)
	{
		_Hours = Hours;
	}
	
	public void setPayRate(Double PayRate)
	{
		_PayRate = PayRate;
	}
	
	
	//Getter
	public String getID()
	{
		return _Id;
	}
	
	public String getName()
	{
		return _Name;
	}
	
	public Double getHours()
	{
		return _Hours;
	}
	
	public Double getPayrate()
	{
		return _PayRate;
	}
	
	//Calculate Gross Pay
	
	public double calcGrossPay()
	{
		double GrossPay = _Hours*_PayRate;
		return GrossPay;	
	}
	public double calcNetPay()
	{
		double NetPay = (calcGrossPay())-(calcGrossPay()*0.15);
		return NetPay;	
	}
	 
	//toString Method
		public String toString()
		{
			String Info = _Id + "\n" + _Name + "\n" + "Gross Pay: " + fmt.format(calcGrossPay()) + "\n" + "Net Pay: "+ fmt.format(calcNetPay()) + "\n";
			return Info;
		}
}
	



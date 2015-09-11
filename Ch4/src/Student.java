
public class Student 
{
	private String _idNumber;
	private int _credits, _points;
	
	public Student(){
		;
	}
	
	public Student(String idNumber, int credits, int points)
	{
		_idNumber = idNumber;
		_credits=credits;
		_points=points;
	}
	
	//Setter
	public void setIdNumber(String idNumber)
	{
		_idNumber = idNumber;
	}
	
	public void setCredit(int credits)
	{
		_credits = credits;
	}
	
	public void set(int points)
	{
		_points = points;
	}
	
	
	//Getter
	public String getidNumber()
	{
		return _idNumber;
	}
	
	public int getCredits()
	{
		return _credits;
	}
	
	public int getPoints()
	{
		return _points;
	}
	
	//GPA Calculate
	public double calcGpa()
	{
		double gpa = (_points*1.0/_credits)*10;
		return gpa;
		
	}
	 
	//Show	
	public void showId()
	{
	 System.out.println("ID Number is: " + _idNumber);
	}
	
	public void showPoints()
	{
		 System.out.println("Points Earned: " + _points);
	}

	public void showCredit()
	{
	 System.out.println("Credit Hours: " + _credits);
	}
}
	



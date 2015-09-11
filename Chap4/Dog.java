
public class Dog 
{
	private String dogName;
	private int dogAge;
	
	
	//Constructor
	public Dog(String name, int age)
	{
		dogName = name;
		dogAge = age;
	}
	
	//Setter
	public void setName(String name)
	{
		this.dogName = name;
	}
	
	public void setAge(int age)
	{
		this.dogAge = age;
	}
	
	//Getter
	public String getName()
	{
		return dogName;
	}
	public int getAge()
	{
		return dogAge;
	} 
	
	//Calculate Person Years
	public int getPersonYears()
	{
		return this.dogAge*7;
	}
	
	//toString Method
	public String toString()
	{
		String xAge = "Your pet "+dogName+" is "+getPersonYears()+" years old in Person years.";
		return xAge;
	}
}

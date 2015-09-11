
import java.text.NumberFormat;

public class Account 
{
	private final double RATE = 0.035;
	
	private long acctNumber;
	private double balance;
	private String name;
	public static String AccountType;
	
	public Account(String name, long acctNumber, double balance, String AccountType)
	{
		this.name = name;
		this.acctNumber = acctNumber;
		this.balance = balance;
		this.AccountType = AccountType;
	}
	  
	public double deposite(double amount)
	{
		balance = balance + amount;
		return balance;
	}
	
	public double withdraw(double amount, double fee)
	{
		balance = balance - amount - fee;
		return balance;
	}
	public double addinterest()
	{
		balance += (balance * RATE);
		return balance;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		return acctNumber + "\t"+ name + "\t" + fmt.format(balance);
	}
	
}

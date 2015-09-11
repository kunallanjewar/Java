import java.text.NumberFormat;

public class Account
{
	private final double RATE = 0.035;
	
	private long acctNumber;
	private double balance;
	private String name;
	
	public Account(String owner, long account, double initial)
	{
		name = owner;
		acctNumber = account;
		balance = initial;
	}
	
	public double deposit(double amount)
	{
		System.out.println("You requested deposite of amount: " + amount);
		if (amount <= 0)
			System.out.println("Please deposite more than 0, Try again!");
		else
			balance = balance + amount;
		return balance;
	}
	
	public double withdraw(double amount, double fee)
	{
		System.out.println("You requested withdraw of amount: " + amount);
		if (amount <= balance + fee)
		balance = balance - amount - fee;
		else
			System.out.println("You can not withdraw more than your current balance, Try again!");
		return balance;
	}

	public double addInterest()
	{
		balance += (balance + RATE);
		return balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return acctNumber + "\t" + name + "\t" + fmt.format(balance);
	}
}

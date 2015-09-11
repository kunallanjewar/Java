
public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to ABC Bank");
		System.out.println();
		
		Account acct1 = new Account("Ted Murphy", 72354, 102.56);
		Account acct2 = new Account("Jane Smith", 69713, 40.00);
		Account acct3 = new Account("Edward Demsey", 93757, 50.32);
					
		double MurphyBalance =  acct1.deposit(600.00);
		System.out.println("Murphy balance after deposite: " + MurphyBalance);
		System.out.println("Murphy balance after withdrawl: " + acct1.withdraw(53.26, 1.50));
		
		System.out.println();
		
		double smithBalance =  acct2.deposit(-1.00);
		System.out.println("Smith balance after deposite: " + smithBalance);
		System.out.println("Smith balance after withdrawl: " + acct2.withdraw(30, 1.50));
		
		System.out.println();

		
		double DemseyBalance =  acct3.deposit(10.00);
		System.out.println("Demsey balance after deposite: " + DemseyBalance);
		System.out.println("Demsey balance after withdrawl: " + acct3.withdraw(700, 1.50));
		
		acct1.addInterest();
		acct2.addInterest();
		acct3.addInterest();
		
		System.out.println();

		System.out.println("Account Summary");
		
		System.out.println();
		System.out.println(acct1);
		System.out.println(acct2);
		System.out.println(acct3);
	}
}


public class Transaction {

	public static void main(String[] args) 
	{
		Account acct1 = new Account("Ted Murphy", 72354, 102.56, "checking");
		
		String AccountType1 = acct1.AccountType;
		
		Account acct2 = new Account("Jane Smith", 69713, 40.00, "savings");
		String AccountType2 = acct1.AccountType;

		Account acct3 = new Account("Edwards Demsey", 72354, 759.32, "checking");
		String AccountType3 = acct1.AccountType;


		acct1.deposite(25.85);
		
		double smithBalance = acct2.deposite(500.00);
		System.out.println("Smith balance after deposite: "+ smithBalance);

		System.out.println("Smith balance after withdrawl: "+ acct2.withdraw(430.75, 1.50));
		
		acct1.addinterest();
		acct2.addinterest();
		acct3.addinterest();

		System.out.println();
		System.out.println(acct1 + " " + AccountType1);
		System.out.println(acct2 + " " + AccountType2);
		System.out.println(acct3 + " " + AccountType3);
}
		
	}



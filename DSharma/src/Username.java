import java.util.Random;
import java.util.Scanner;


public class Username {

	public static void main(String[] args){
		
		String Fname, Lname;
		int RandomN;
		char FirstChar;
		
		Scanner sc = new Scanner(System.in);
		Random MyRandomNumber = new Random();
		
		RandomN = MyRandomNumber.nextInt(90) + 10;
		
		System.out.print("Enter your name: ");
		Fname = sc.nextLine();
		
		System.out.print("Enter your last name: ");
		Lname = sc.nextLine();
		
		FirstChar = Fname.charAt(0);
		
		System.out.println("Username is: " + FirstChar + Lname + RandomN);
		
		
		
	}
}

import java.util.Scanner;


public class NameLength {

	public static void main(String[] args) {
		String FirstN, SecondN, FullN;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Your First Name: ");
		FirstN = scan.nextLine();
		System.out.print("Enter Your Last Name: ");
		SecondN = scan.nextLine();
		
		FullN = FirstN + SecondN;
		
		System.out.println("Name: " + FirstN + " " + SecondN);
		
		System.out.println("Number of characters in your name: " + FullN.length());
		
	}

}

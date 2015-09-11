import java.util.Scanner;
import java.util.Random;;

public class UsernameGenerator {

	public static void main(String[] args) {
		int RandomN;
		char FirstChar;
		String FirstN, SecondN;
		Random MyRandomNumber = new Random();
		

		Scanner scan = new Scanner(System.in);
		
		RandomN = MyRandomNumber.nextInt(90) + 10;

		System.out.print("Enter Your First Name: ");
		FirstN = scan.nextLine();
		System.out.print("Enter Your Last Name: ");
		SecondN = scan.nextLine();
		
		FirstChar = FirstN.charAt(0);

		System.out.println("UserName: " + FirstChar+SecondN+RandomN);

		

	}

}

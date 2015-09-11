import java.util.Scanner;


public class NLength {

	public static void main(String[] args){
		
		String Fname, Lname;
		String Length;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your first name: ");
		Fname = sc.nextLine();
		
		System.out.println("Enter your last name: ");
		Lname = sc.nextLine();
		
		Length = Fname + Lname;
		
		System.out.println("The length is: " + Length.length());
		
	}
}

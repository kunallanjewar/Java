import java.util.Scanner;


public class TwoLinesTest {

	public static void main(String[] args) {
	
		String FirstL, SecondL;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Please Type First Line");
		FirstL = scan.nextLine();
		
		System.out.println("Please Type Second Line");
		SecondL = scan.nextLine();
				
		System.out.println("The Result is: "+ FirstL+" "+SecondL );

	}

}

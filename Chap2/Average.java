import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int FirstNo, SecondNo, ThirdNo;
Double Average;

Scanner scan = new Scanner(System.in);

System.out.println("Please Enter First Number.");
FirstNo = scan.nextInt();		

System.out.println("Please Enter Second Number.");
SecondNo = scan.nextInt();		

System.out.println("Please Enter Third Number.");
ThirdNo = scan.nextInt();		

Average = (double) (FirstNo + SecondNo + ThirdNo)/3;

System.out.println("The Avegrage of 3 numbers is: " + Average);


	}

}

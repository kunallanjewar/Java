import java.util.Scanner;


public class Print {

	public static void main(String[] args){
		
		String name;
		char c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		name = sc.nextLine();
		
		for(int i = 0; i<=name.length()-1; i++){
			c = name.charAt(i);
			System.out.println(c);
		}
		
		
	}
}

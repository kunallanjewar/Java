import java.util.Scanner;
import java.text.NumberFormat;

public class Discount 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Double Price, Total, xDiscount;
		int Quantity;

		Scanner scan = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getCurrencyInstance();


		System.out.print("Enter Price: ");
		Price = scan.nextDouble();

		System.out.print("Enter quantity: ");
		Quantity = scan.nextInt();

		Total = Price*Quantity;
		
		System.out.println("Price: " + fmt.format((Price)));
		
		System.out.println("Quantity: " + Quantity);

		//Calculate Discount
		
		if (Quantity >= 10)
		{
			xDiscount = (Total-0.95*Total);
			System.out.println("Total:" + fmt.format((Price*Quantity) - xDiscount));
		}
		else
			System.out.println("Total: " + fmt.format(Price*Quantity));

	}

}

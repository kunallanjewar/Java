import java.text.NumberFormat;

public class Invoicing 
{
	static NumberFormat fmt = NumberFormat.getCurrencyInstance();

	public static void main(String[] args)
	{
		computeInvoice (24.95);	
		computeInvoice (17.50, 4);	
		computeInvoice (10,6,20);	
	}
	public static void computeInvoice(double price)
	{
		double total = price + (price*0.08) ;
		System.out.println("Total: " + fmt.format(total));
		System.out.println();
	}
	public static void computeInvoice(double price, int quantity)
	{
		double subTotal = price*quantity;
		double total = subTotal + (subTotal*0.08);
		System.out.println("Total: " + fmt.format(total));
		System.out.println();
	}
	public static void computeInvoice(double price, int quantity, int coupon)
	{
		double subTotal = (price*quantity)-coupon;
		double total = subTotal + (subTotal*0.08);
		System.out.println("Total: " + fmt.format(total));
		System.out.println();
	}

}

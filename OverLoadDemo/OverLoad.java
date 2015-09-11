
public class OverLoad 
{
	public static void main(String[] args)
	{
		MyDisplay(47);
		MyDisplay("Buster");
		MyDisplay(6,"Mr. Coyote");
	}
	public static void MyDisplay(int Myint)
	{
		System.out.println("MyInt: " + Myint);
	}
	public static void MyDisplay(String MyStr)
	{
		System.out.println("MyStr: " + MyStr);

	}
	public static void MyDisplay(int intB, String strB)
	{
		System.out.println("intB: " + intB+" and srtB "+ strB);

	}
}


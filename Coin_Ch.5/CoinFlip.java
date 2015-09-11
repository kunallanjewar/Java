
public class CoinFlip {

	public static void main(String[] args) 
	{

		MonetoryCoin MonetoryCoin = new MonetoryCoin(1);
		MonetoryCoin.flip();
		System.out.println(MonetoryCoin);

		MonetoryCoin MonetoryCoin5 = new MonetoryCoin(5);
		MonetoryCoin5.flip();
		System.out.println(MonetoryCoin5);

		MonetoryCoin MonetoryCoin10 = new MonetoryCoin(10);
		MonetoryCoin10.flip();
		System.out.println(MonetoryCoin10);

		MonetoryCoin MonetoryCoin25 = new MonetoryCoin(25);
		MonetoryCoin25.flip();
		System.out.println(MonetoryCoin25);

		int Sum = MonetoryCoin.getValue() + MonetoryCoin5.getValue()+MonetoryCoin10.getValue()+MonetoryCoin25.getValue();

		System.out.println("");

		System.out.println("Total Value: "+ Sum);

	}

}

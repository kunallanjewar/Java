import javax.swing.JOptionPane;

public class SumProduct {

	public static void main(String[] args) 
	{
		String numStr1,numStr2, result;
		int num1,num2, again;

		do
		{
			numStr1 = JOptionPane.showInputDialog("Enter an Interger: ");
			num1 = Integer.parseInt(numStr1);

			numStr2 = JOptionPane.showInputDialog("Enter another Interger: ");
			num2 = Integer.parseInt(numStr2);

			result = "You Entered " + numStr1 + " and " + numStr2 + "\n" +"The sum of these numbers is " + (num1 + num2) + "\n" + "The product of these numbers is " + (num1 * num2);

			JOptionPane.showMessageDialog(null, result);
			again = JOptionPane.showConfirmDialog(null, "Another?");
			
		} while (again == JOptionPane.YES_NO_OPTION);
	}
}

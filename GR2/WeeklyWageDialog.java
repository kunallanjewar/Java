import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class WeeklyWageDialog 
{
	public static void main(String[] args) 
	{
		String numStr1,numStr2, result;
		double Wage, again = 0, Hours = 0;
		boolean jumpLoop = true;

		do 
		{
			numStr1 = JOptionPane.showInputDialog("Enter employee's hourly wage: ");
			Wage = Double.parseDouble(numStr1);

			numStr2 = JOptionPane.showInputDialog("Enter Hours Worked: ");
			Hours = Double.parseDouble(numStr2);
			
			NumberFormat fmt = NumberFormat.getCurrencyInstance();

			if (Hours<=40)
			{
				result = "Weekly Salary is " + fmt.format(Hours*Wage) + "\n" +"Hours Worked " + Hours;
				JOptionPane.showMessageDialog(null, result);
				jumpLoop = false;
			}
			else
			{
				again = JOptionPane.showConfirmDialog(null, "Please enter 40 or less Hours. Try Again?");
			}
		} while  (again == JOptionPane.YES_NO_OPTION && jumpLoop!=false);
	}
}
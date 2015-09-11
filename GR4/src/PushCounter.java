import javax.swing.JFrame;

public class PushCounter 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Push Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new PushCounterpanel());
		frame.pack();
		frame.setVisible(true);
	}
}

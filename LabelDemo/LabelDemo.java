import java.awt.*;
import javax.swing.*;

public class LabelDemo
{
	
	public static void main (String[] args)
	{
		JFrame frame = new JFrame ("Label Demo");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon = new ImageIcon ("devil.gif");
		
		JLabel label1, label2, label3, label4;
		
		label1 = new JLabel ("Devil Left", icon, SwingConstants.CENTER);
		
		label2 = new JLabel ("Devil Right", icon, SwingConstants.CENTER);
		label2.setHorizontalTextPosition (SwingConstants.LEFT);
		label2.setVerticalTextPosition (SwingConstants.BOTTOM);
		
		label3 = new JLabel ("Devil Above", icon, SwingConstants.CENTER);
		label3.setHorizontalTextPosition (SwingConstants.CENTER);
		label3.setVerticalTextPosition (SwingConstants.BOTTOM);
		
		label4 = new JLabel ("Devil Below", icon, SwingConstants.CENTER);
		label4.setHorizontalTextPosition (SwingConstants.CENTER);
		label4.setVerticalTextPosition (SwingConstants.TOP);
		
		JPanel panel = new JPanel();
		
		panel.setBackground (Color.cyan);
		panel.setPreferredSize (new Dimension (250, 300));
		panel.add (label1);
		panel.add (label2);
		panel.add (label3);
		panel.add (label4);

		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
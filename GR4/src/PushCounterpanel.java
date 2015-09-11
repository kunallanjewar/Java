import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushCounterpanel extends JPanel
{
	private int count;
	private JButton push;
	private JLabel label;

	public PushCounterpanel()
	{
		//count=0;

		push = new JButton("Push Me!");
		push.addActionListener(new ButtonListener());

		label = new JLabel("Pushes:");

		add(push);
		add(label);

		setPreferredSize(new Dimension(300, 40));
		setBackground(Color.cyan);
	}

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			count = (int)(Math.random()*100);			
			label.setText("Pushes: " + count);
		}
	}
}
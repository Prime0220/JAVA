//20210514_GameProgramming_second

package AWT_test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrame3Demo extends JFrame
{
	
	JFrame3Demo()
	{
		setTitle("Hello swing ! ");
		
		JPanel p = new JPanel();
		JLabel l = new JLabel(" Hello Swing! ");
		JButton b = new JButton(" push ");
		
		p.add(l);
		p.add(b);
		add(b);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
//		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new JFrame3Demo();
	}
	
}

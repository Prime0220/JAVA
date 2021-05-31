//20210521_GameProgramming

package AWT_test;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class BorderLayoutDemo extends JFrame
{
	
	BorderLayoutDemo()
	{
		setTitle(" Border Layout ");
		setLayout(new BorderLayout());
		
		add(" East ", new JButton(" East "));
		add(" West ", new JButton(" West "));
		add(" North ", new JButton(" North "));
		add(new JButton(" South "), BorderLayout.SOUTH);
		add(new JButton(" Center "), BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 110);
		setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new BorderLayoutDemo();
}
}

package AWT_test;

import java.awt.GridLayout;

import javax.swing.*;

public class GridLayoutDemo extends JFrame
{
	
	GridLayoutDemo() 
	{
		setTitle(" Grid Layout ");
		setLayout(new GridLayout(0, 3));
		
		add(new JButton(" first btn "));
		add(new JButton(" second btn "));
		add(new JButton(" third btn "));
		add(new JButton(" forth btn "));
		add(new JButton(" fifth btn "));
		add(new JButton(" sixth btn "));

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 110 );
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new GridLayoutDemo();
	}
	
	
}

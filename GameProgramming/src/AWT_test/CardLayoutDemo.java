package AWT_test;

import java.awt.*;
import javax.swing.*;

public class CardLayoutDemo extends JFrame
{
	CardLayout layout;
	
	public void rotate() {
		while (true) {
			try 
			{
				Thread.sleep(500);
			}
			catch (Exception e)
			{
				
			}
			layout.next(this.getContentPane());	
		}
	}
	
	public CardLayoutDemo() 
	{
		
		setTitle(" Card Layout ");
		setLayout(layout);
		
		add("0", new JButton(" 버튼 0 "));
		add("1", new JButton(" 버튼 1 "));
		add("2", new JButton(" 버튼 2 "));
		add("3", new JButton(" 버튼 3 "));
		add("4", new JButton(" 버튼 4 "));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 110);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new CardLayoutDemo().rotate();
	}
	
	
}

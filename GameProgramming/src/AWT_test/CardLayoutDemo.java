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
		
		add("0", new JButton(" ��ư 0 "));
		add("1", new JButton(" ��ư 1 "));
		add("2", new JButton(" ��ư 2 "));
		add("3", new JButton(" ��ư 3 "));
		add("4", new JButton(" ��ư 4 "));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 110);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new CardLayoutDemo().rotate();
	}
	
	
}

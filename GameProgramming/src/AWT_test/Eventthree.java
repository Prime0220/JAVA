package AWT_test;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Eventthree extends JFrame
{
	public Eventthree() 
	{
		
		setTitle(" key adapter ");
		
		JLabel l = new JLabel("", JLabel.CENTER);
		JTextField t = new JTextField(20);
		
		add("North", t);
		add("Center", l);
		
		t.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent e) 
			{

				if (e.getKeyCode() == KeyEvent.VK_ENTER) 
				{
					
					l.setText("입력한 문자열 : " + t.getText());
					
					
				}
			
			}
		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
		
		
		
	}	
	
	public static void main(String[] args) 
	{
		new Eventthree();
	}
	
	
}

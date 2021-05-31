package AWT_test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Eventone extends JFrame
{
	public Eventone() 
	{
		setTitle(" Event ");
		
		
		
//		ActionListener l = new ActionListener() 
//		{
//			
//			@Override
//			public void actionPerformed(ActionEvent e) 
//			{
//			System.out.println("버튼을 누르셨습니다.");
//			}
//		};
		
		ActionListener l = e-> System.out.println("버튼을 누르셨습니다.");
		
		JButton b = new JButton("press button");
			
			b.addActionListener(l);
			
			add(b);
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(300, 200);
			setVisible(true);	
	}
	
	
	
	public static void main(String[] args) 
	{
		new Eventone();
	}
	
}

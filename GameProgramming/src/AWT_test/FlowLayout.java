//20210521_GameProgramming

package AWT_test;

import java.awt.*;
import javax.swing.*;

public class FlowLayout extends JFrame
{
	
	FlowLayout() 
	{
		setTitle(" Flow Layout ");
		JPanel p = new JPanel(new java.awt.FlowLayout());
		p.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		JButton b1 = new JButton(" first ");
		JButton b2 = new JButton(" second ");
		JButton b3 = new JButton(" third ");
		JButton b4 = new JButton(" forth ");
		JButton b5 = new JButton(" fifth ");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		add(p);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new FlowLayout();
	}
	
}

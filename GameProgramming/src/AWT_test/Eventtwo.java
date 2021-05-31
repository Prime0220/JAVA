package AWT_test;

import java.awt.*;
import javax.swing.*;

public class Eventtwo extends JFrame
{	
	public Eventtwo() 
	{
		
		setTitle(" Scroll bar ");
		
		JLabel label = new JLabel(" ", JLabel.CENTER);
		
		JScrollBar bar = new JScrollBar(JScrollBar.HORIZONTAL);
		bar.setValues(50, 10, 0, 110);
		bar.addAdjustmentListener(e->
		{
			int v = e.getValue();
			label.setText("À§Ä¡ : " + v);
			
		});
			
		add("Center", label);
		add("North", bar);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new Eventtwo();
	}
		
	
}

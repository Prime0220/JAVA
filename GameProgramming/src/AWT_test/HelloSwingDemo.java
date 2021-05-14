//20210514_GameProgramming_first

package AWT_test;

import javax.swing.JFrame;


class MyFrame extends JFrame 
{
	MyFrame() 
	{
		setTitle(" Hello Swing ! ");
		setSize(300, 100);
		setVisible(true);
	}
}


public class HelloSwingDemo 
{
	
	public static void main(String[] args)
	{	
		
		new MyFrame();
	}
	
}

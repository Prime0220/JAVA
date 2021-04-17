//20210416_gameProgramming

package awt_test;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FirstFrame extends Frame 
{
	
	public FirstFrame() 
	{
		setTitle(" ù��° ������ ");
		setSize(400,400);
		setVisible(true);	
		
		addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				dispose();
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) 
	{
		new FirstFrame();
	}
	
}

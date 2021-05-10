//20210510_GameProgramming

package AWT_test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LayoutFrame extends Frame
{

	public LayoutFrame() 
	{
		// border layout
		// 1. ��üȭ�� ���Ѽ� �ִ� ���
		// 2. �޼ҵ� �ȿ��ٰ� �׳� ����
	
		setTitle(" ���̾ƿ� ������ ");
		setSize(500, 500);
		setVisible(true);
		
		BorderLayout borderLayout = new BorderLayout(); // 1�� ���
		setLayout(borderLayout);
//		setLayout(new BorderLayout()); // 2�� ���
		
		// �������� ���̾ƿ��� �������̾ƿ� ����
		// ������Ʈ (��ư�� ��ġ �Ѵ�.)
		
		Button northBtn = new Button(" ���� ��ư ");
		Button southBtn = new Button(" ���� ��ư ");
		Button eastBtn = new Button(" ���� ��ư ");
		Button westBtn = new Button(" ���� ��ư ");
		Button centerBtn = new Button(" ��� ��ư ");
		
		add(northBtn, borderLayout.NORTH);
		add(southBtn, borderLayout.SOUTH);
		add(eastBtn, borderLayout.EAST);
		add(westBtn, borderLayout.WEST);
		add(centerBtn, borderLayout.CENTER);
		
		//
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
	
}

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
		// 1. 객체화를 시켜서 넣는 방법
		// 2. 메소드 안에다가 그냥 생성
	
		setTitle(" 레이아웃 프레임 ");
		setSize(500, 500);
		setVisible(true);
		
		BorderLayout borderLayout = new BorderLayout(); // 1번 방법
		setLayout(borderLayout);
//		setLayout(new BorderLayout()); // 2번 방법
		
		// 프레임의 레이아웃을 보더레이아웃 세팅
		// 컴포넌트 (버튼을 배치 한다.)
		
		Button northBtn = new Button(" 북쪽 버튼 ");
		Button southBtn = new Button(" 남쪽 버튼 ");
		Button eastBtn = new Button(" 동쪽 버튼 ");
		Button westBtn = new Button(" 서쪽 버튼 ");
		Button centerBtn = new Button(" 가운데 버튼 ");
		
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

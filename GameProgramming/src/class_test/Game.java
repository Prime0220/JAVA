//20210409_�������α׷���

package class_test;

import java.util.Random;

public class Game 
{
	
	Random dice = new Random();
	
	public Game() 
	{
		int diceNum = dice.nextInt(6) + 1;
		
		System.out.println("���� �ֻ��� ���� : " + diceNum);
		
		
	}
	
	
	public Game(int checkNum) 
	{
		
		
		int diceNum = dice.nextInt(6 - checkNum) + 1 + checkNum;
		System.out.println(checkNum + " ������ ���ڸ� ������ �ֻ��� ���� : " + diceNum);
		
		
	}

	
	
	
}

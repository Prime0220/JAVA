//20210409_gameProgrammingtest 

package class_test;

import java.util.Random;

public class DiceGame 
{

	Random dice = new Random();

	public DiceGame() 
	{

		int cnt = 0;
		
		while (true) {
			
			int firstDice = dice.nextInt(6)+1;
			int secondDice = dice.nextInt(6)+1;
			int DiceSum = firstDice + secondDice;
			
			System.out.println("[" + firstDice + ", " + secondDice + "]" + "�� �ֻ��� ����� ���� ��  : " + DiceSum);
			cnt ++;
			
			if (DiceSum == 5) 
			{
				System.out.println("�ֻ����� �� " + cnt + "�� ���Ƚ��ϴ�.");
				break;
			}

		}

	}

}

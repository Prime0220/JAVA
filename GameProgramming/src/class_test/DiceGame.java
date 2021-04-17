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
			
			System.out.println("[" + firstDice + ", " + secondDice + "]" + "두 주사위 결과를 합한 값  : " + DiceSum);
			cnt ++;
			
			if (DiceSum == 5) 
			{
				System.out.println("주사위를 총 " + cnt + "번 굴렸습니다.");
				break;
			}

		}

	}

}

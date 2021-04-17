//20210409_게임프로그래밍

package class_test;

import java.util.Random;

public class Game 
{
	
	Random dice = new Random();
	
	public Game() 
	{
		int diceNum = dice.nextInt(6) + 1;
		
		System.out.println("뽑힌 주사위 숫자 : " + diceNum);
		
		
	}
	
	
	public Game(int checkNum) 
	{
		
		
		int diceNum = dice.nextInt(6 - checkNum) + 1 + checkNum;
		System.out.println(checkNum + " 이하의 숫자를 제외한 주사위 숫자 : " + diceNum);
		
		
	}

	
	
	
}

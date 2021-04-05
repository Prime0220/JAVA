//20210331_게임프로그래밍_연습

package method;

import java.util.Scanner;

public class Methodtest 
{
	public static void main(String[] args) 
	{
		
		int a = 0, b = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력해주세요 : ");
		a = sc.nextInt();
		System.out.print("첫번째 정수를 입력해주세요 : ");
		b = sc.nextInt();
		
		System.out.println("두 수를 합한 결과 : " + twoNumberSum(a, b));
		
		
	}
	
	private static int twoNumberSum(int a, int b) 
	{
		
		return a + b;
	}  
	
}

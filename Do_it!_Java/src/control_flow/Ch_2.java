 package control_flow;

public class Ch_2 
{
	public static void main(String[] args) 
	{
		
		int num = 1, sum = 0; 
		
		// while 조건에 만족할때까지 계속 돌아버림.
		while(num <= 10) 
		{
			sum += num;
			num ++;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다. ");

		
		num = 1;
		sum = 0;
		
		// do while 무조건 한번 실행시키고 조건으로 넘어갈때 쓰임 잘 안쓰임
		do 
		{
			
			sum += num;
			num ++;
		
		}
		while(num < 1); 
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다. ");
		
		// for문  초기화식, 조건식, 증감식을 한꺼번에 작성
		int for_num;
		
		for (for_num = 1; for_num <=  5; for_num++) 
		{
			
			System.out.println(for_num);
			
		}
		
		
	}
}

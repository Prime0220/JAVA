//20210329_게임프로그래밍

package method;

public class Method2 
{

	static int superPoint = 3;

	public static void main(String[] args) 
	{
		int userCommand = 1;

		if (superPoint > 1) {
			//필살기를 쓸 수 있음 . 
			attack(superPoint);
		}
		else
		{
			//노멀어택을 쓸 수 있음.
			attack();
		}

	}//main 메소드 
	
	static void attack() 
	{
		System.out.println("아도겐~");
	}
	static void attack(int Point) 
	{
		--superPoint;
		
		System.out.println("슈퍼 아도겐~");
		System.out.println("슈퍼 필살 게이지가 " + superPoint + "개 남았습니다.");
	}
	
	
}

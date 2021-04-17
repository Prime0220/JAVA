// 20210405_게임프로그래밍

package class_test;

public class Car 
{

	int oilBox = 10, speed = 0;
	
	boolean engineState = false;


	void startEngine() // 시동
	{

		if (engineState) 
		{
			//true일때 출력
			System.out.println("시동이 걸려있습니다.");
		}
		else // 시동이 안걸려 있을때
		{
			if (oilBox > 0) //오일이 1이상일때
			{
				engineState = true; // 시동이 걸림
			}
		}
		
		
	}
	
	void endEngine() // 시동 끔
	{
		
		// 시동 끔 
		engineState = false; 
		// 현재 상태 출력 
		System.out.println("시동이 꺼졌습니다.");
		
	}
	
	void speedUp() // 속력 
	{
		if (engineState) // 시동이 걸렸는지 확인
		{
			if (oilBox > 0) // 현재 남아있는 오일이 1이상인지 확인
			{
				speed += 10; // 속력이 늘어남
				--oilBox; // 속력이 늘어날때마다 오일이 줄음
				System.out.println("현재 속력 : " + speed);
				System.out.println("현재 남은 오일 : " + oilBox);
			}
			
		}
		else 
		{
			endEngine(); // 엔진 다운
		}
		
		
	}
	
	void inputOil(RefuelCar refuelcar) // 주유차
	{
		oilBox = refuelcar.getOil(); // 주유
	}

}

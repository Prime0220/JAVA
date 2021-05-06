package control_flow;

public class Ch_1 
{
	public static void main(String[] args) 
	{
		
		//if문
		int age = 2;
		
		if (age >= 8) 
		{
			System.out.println("학교에 다닙니다. ");
		}
		else
		{
			System.out.println("학교에 다니지 않습니다. ");
		}
		 
		System.out.println("------------------------------");
		
		//if else + else if문
		age = 9;
		int charge;
		
		if (age < 8) 
		{
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}
		else if (age < 14) 
		{
			charge = 2000;
			System.out.println("초등학생 입니다. ");
		}
		else if (age < 20) 
		{
			charge = 2500;
			System.out.println("중/고등 학생입니다. ");
		}
		else
		{
			charge = 3000;
			System.out.println("일반인입니다. ");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
		System.out.println("------------------------------");
		
		//switch-case문
		int rank = 1;
		char medalColor;
		if (rank == 1) 
		{
			medalColor = 'G';
		}
		else if (rank == 2)
		{
			medalColor = 'S';
		}
		else if (rank == 3)
		{
			medalColor = 'B';
		}
		else
		{
			medalColor = 'A';
		}
		
		System.out.println("Rank : " + rank + "\n medalColor : " + medalColor);
		

		//위에 if문을 switch문으로 바꾸면
		rank = 2;
		switch (rank) 
		{
		case 1 : medalColor = 'G';
		break;
		
		case 2 : medalColor = 'S';
		break;
		
		case 3 : medalColor = 'B';
		break;

		default : medalColor = 'A';
			break;
		}
		System.out.println("Rank : " + rank + "\n medalColor : " + medalColor);
		
		System.out.println("--------------------------------------");

		
		int month =10, day;
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
			
		case 2 : 
			day = 28;
			break;
			
		case 4: case 6 : case 9: case 11:
			day = 30;
			break;
			
		default:
			day = 0;
			System.out.println("범위를 벗어나셨습니다. ");
			break;
		}
		if (month > 0 && month < 13) {
			
		System.out.println(month + "월은 " + day + "까지 있습니다. ");
		}
		
		
		
		
	}
}

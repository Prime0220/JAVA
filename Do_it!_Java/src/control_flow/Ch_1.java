package control_flow;

public class Ch_1 
{
	public static void main(String[] args) 
	{
		
		//if��
		int age = 2;
		
		if (age >= 8) 
		{
			System.out.println("�б��� �ٴմϴ�. ");
		}
		else
		{
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�. ");
		}
		 
		System.out.println("------------------------------");
		
		//if else + else if��
		age = 9;
		int charge;
		
		if (age < 8) 
		{
			charge = 1000;
			System.out.println("�� ���� �Ƶ��Դϴ�.");
		}
		else if (age < 14) 
		{
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�. ");
		}
		else if (age < 20) 
		{
			charge = 2500;
			System.out.println("��/��� �л��Դϴ�. ");
		}
		else
		{
			charge = 3000;
			System.out.println("�Ϲ����Դϴ�. ");
		}
		
		System.out.println("������ " + charge + "�� �Դϴ�.");
		System.out.println("------------------------------");
		
		//switch-case��
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
		

		//���� if���� switch������ �ٲٸ�
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
			System.out.println("������ ����̽��ϴ�. ");
			break;
		}
		if (month > 0 && month < 13) {
			
		System.out.println(month + "���� " + day + "���� �ֽ��ϴ�. ");
		}
		
		
		
		
	}
}

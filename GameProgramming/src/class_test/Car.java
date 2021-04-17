// 20210405_�������α׷���

package class_test;

public class Car 
{

	int oilBox = 10, speed = 0;
	
	boolean engineState = false;


	void startEngine() // �õ�
	{

		if (engineState) 
		{
			//true�϶� ���
			System.out.println("�õ��� �ɷ��ֽ��ϴ�.");
		}
		else // �õ��� �Ȱɷ� ������
		{
			if (oilBox > 0) //������ 1�̻��϶�
			{
				engineState = true; // �õ��� �ɸ�
			}
		}
		
		
	}
	
	void endEngine() // �õ� ��
	{
		
		// �õ� �� 
		engineState = false; 
		// ���� ���� ��� 
		System.out.println("�õ��� �������ϴ�.");
		
	}
	
	void speedUp() // �ӷ� 
	{
		if (engineState) // �õ��� �ɷȴ��� Ȯ��
		{
			if (oilBox > 0) // ���� �����ִ� ������ 1�̻����� Ȯ��
			{
				speed += 10; // �ӷ��� �þ
				--oilBox; // �ӷ��� �þ������ ������ ����
				System.out.println("���� �ӷ� : " + speed);
				System.out.println("���� ���� ���� : " + oilBox);
			}
			
		}
		else 
		{
			endEngine(); // ���� �ٿ�
		}
		
		
	}
	
	void inputOil(RefuelCar refuelcar) // ������
	{
		oilBox = refuelcar.getOil(); // ����
	}

}

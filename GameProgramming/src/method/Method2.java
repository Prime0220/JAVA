//20210329_�������α׷���

package method;

public class Method2 
{

	static int superPoint = 3;

	public static void main(String[] args) 
	{
		int userCommand = 1;

		if (superPoint > 1) {
			//�ʻ�⸦ �� �� ���� . 
			attack(superPoint);
		}
		else
		{
			//��־����� �� �� ����.
			attack();
		}

	}//main �޼ҵ� 
	
	static void attack() 
	{
		System.out.println("�Ƶ���~");
	}
	static void attack(int Point) 
	{
		--superPoint;
		
		System.out.println("���� �Ƶ���~");
		System.out.println("���� �ʻ� �������� " + superPoint + "�� ���ҽ��ϴ�.");
	}
	
	
}

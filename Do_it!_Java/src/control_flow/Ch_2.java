 package control_flow;

public class Ch_2 
{
	public static void main(String[] args) 
	{
		
		int num = 1, sum = 0; 
		
		// while ���ǿ� �����Ҷ����� ��� ���ƹ���.
		while(num <= 10) 
		{
			sum += num;
			num ++;
		}
		
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�. ");

		
		num = 1;
		sum = 0;
		
		// do while ������ �ѹ� �����Ű�� �������� �Ѿ�� ���� �� �Ⱦ���
		do 
		{
			
			sum += num;
			num ++;
		
		}
		while(num < 1); 
		
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�. ");
		
		// for��  �ʱ�ȭ��, ���ǽ�, �������� �Ѳ����� �ۼ�
		int for_num;
		
		for (for_num = 1; for_num <=  5; for_num++) 
		{
			
			System.out.println(for_num);
			
		}
		
		
	}
}

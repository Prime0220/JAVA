package variable_datatype;

public class Ch_2 
{
	public static void main(String[] args) 
	{
		int num;
		//Lvalue(���ʰ�) = rValue(�����ʰ�);
		num = 10;
		
		System.out.println(num);
		
		//����� ���ÿ� �ʱ�ȭ
		
		int level = 20;
		System.out.println(level);
		
		//������ �ǹ��ְ� ����
		
		int ns; 			//������ ��
		int numberOFStudent;//���� ��
		
		//ByteVariable
		
		byte bData = -128;
		System.out.println(bData);
		
		byte bData2 = 127;
		System.out.println(bData2);
		
		//long
		
		long num1 = 12345678900L; // L == �ĺ���
		System.out.println();
		
		//char - ���� �ڷ��� 
		
		char ch = 'A';
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		ch = 66;// B
		
		System.out.println(ch);
		
		int ch2 = 67;
		
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		//float, double - �Ǽ� �ڷ���
		
		double dNum = 3.14;	// 8byte
		float fNum = 3.14F; // 4byte, F == �ĺ���
	}
}

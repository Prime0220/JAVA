package variable_datatype;

public class Ch_3 
{
	public static void main(String[] args) 
	{
		
	int iNum = 1000;
	byte bNum = (byte)iNum;
	
	System.out.println(iNum);
	System.out.println(bNum);
	
	double dNum = 3.14;
	iNum = (int)dNum;
	
	System.out.println(iNum);
	float fNum = 0.9F;

	// 3.14�� 0.9�� int�� �ٲ� �� ���� 
	int num1 = (int)dNum + (int)fNum;
	// 3.14 + 0.9�� ���� int�� �ٲ�
	int num2 = (int)(dNum + fNum); 
	
	System.out.println(num1);
	System.out.println(num2);
	
	
	
	}
}

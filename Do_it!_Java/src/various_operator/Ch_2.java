package various_operator;

public class Ch_2 
{

	public static void main(String[] args) 
	{

		// ���� ���� ������ Compound assignment operator

		int num = 10;

		System.out.println(num += 1);

		System.out.println(num %= 10);
		num -= 1;	// num = num - 1
		System.out.println(num);
		
		//���� ������  Conditional operator
		
		int a = (5 > 3)? 10:20;
		System.out.println(a);
		
		int fatherAge = 45, motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(fatherAge + " > " + motherAge + " : " +ch);
		
		//��Ʈ ������ Bit opertator 
		//c��� ���� ���� �� �ڹٿ��� �� �Ⱦ� , �������� ����� �� ����
		
		int b = 5, c = 10;
		int result = b & c;
		
		System.out.println(result);
		
		int d = 5;
		System.out.println(d << 1); // = x2�� ����.
		System.out.println(d); // d�� ���� �ٲ��� �ʴ´�. 
		System.out.println(d <<= 1); //�ٲ�� �Ϸ��� <<=�� ������.
		System.out.println(d);
		
		d = 5;
		
		System.out.println(d << 2);
		System.out.println(d << 3);
		
		System.out.println(d >> 1); //00000010
		
	}
}

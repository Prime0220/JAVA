package various_operator;

public class Ch_1 
{
	public static void main(String[] args) 
	{
		
		//���� ������ Assignment operator
		// datatype Leftvalue = Rightvalue 
		int age = 24;
		int mathScore = 80, engScore = 70;
		
		//���� �����ڴ� �켱 ������ ����
		int totalScore = mathScore + engScore;
		
		System.out.println(age);
		System.out.println(totalScore);
		
		int num = 10;
		int num2 = -num;
		
		System.out.println(num + ", " + num2);
		
		//num���� �ٲٰ� ������
		num = -num;
		System.out.println(num);
		
		//��������� Arithmetic operator
		int a = 10, b = 2;
		
		// + �� ���� ����
		System.out.println(a + " + " + b +" = " + a+b);
		// - �տ� �ִ� �׿��� �ڿ� �ִ� ���� ��
		System.out.println(a + " - " + b +" = " + (a-b));
		// * �� ���� ����
		System.out.println(a + " * " + b +" = " + a*b);
		// / �� ���� ������ ���� ����
		System.out.println(a + " �� " + b +" = " + a/b);
		// % �� ���� ������ �������� ����
		System.out.println(a + " �� " + b +" �� ������  " + a%b);
		
		
		//����  ������ Increment operator
		int c = 0;		
		System.out.println(c);
		c++;
		System.out.println(c);
		c++;
		System.out.println(c);
		c++;
		System.out.println(c);
		c++;
		System.out.println(c);
		
		//���� ������ Reduction operator
		int d = 10;
		System.out.println(d);
		d--;
		System.out.println(d);
		d--;
		System.out.println(d);
		d--;
		System.out.println(d);
		d--;
		System.out.println(d);
		// ++, --�� ��ġ�� ���� ����, �����ϴ� ������ �޶�����.
		
		//���� ������ Relational operator
		
		int e = 4;
		// > �������� ũ�� ��, �ƴϸ� ����
		System.out.println(e + " > 3	: " + (e>3));
		// < �������� ������ ��, �ƴϸ� ����
		System.out.println(e + " < 3	: " + (e<3));
		// >= �������� ũ�ų� ������ ��, �ƴϸ� ����
		System.out.println(e + " >= 3	: " + (e>=3));
		// <= �������� �۰ų� ������ ��, �ƴϸ� ����
		System.out.println(e + " <= 3	: " + (e<=3));
		// == �������� ������ �װ� ������ ��, �ƴϸ� ����
		System.out.println(e + " == 3	: " + (e==3));
		// != �������� ������ ���̶� �ٸ��� ��, �ƴϸ� ���� 
		System.out.println(e + " != 3	: " + (e!=3));
		
		//�� ������ Logical operator ,
		//�ܶ� ȸ�� �� Short Circuit Evaluation
		
		int f = 10;
		int i = 2;
		
		// �� ���� ���� ��� ���̾�� ��
		boolean value = ((f = f + 10)< 10) && ((i = i + 2) < 10);
		System.out.println(f + " < 10 && "+ i + " < 10	: " + value);

		// �� ���� ���� �ϳ��� ���̸� ��
		value = ((f = f + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(f + " > 10 || "+ i + " < 10	: " +value);
		
		
		
		
		
	}
}

package exercise;

import java.util.Scanner;

public class variable_datatype_test 
{
	public static void main(String[] args) 
	{
		
		
		//p. 37 Q6
		System.out.println("��ȭ��");
		
		//p.45 1minute review 
		int age;
		age = 18;
		System.out.println(age);
		
		//p.53 1minute review
		char ch1 = 'Z', ch2 = 38;
		
		int ch3 = 97;
		
		System.out.println(ch1 + "\n" + ch1 + "�� �ش��ϴ� ���� �� : " + (int)ch1);
		System.out.println("38�� �ش��ϴ� ���� : " + ch2);
		System.out.println(ch3 + "\n" + ch3 + "�� �ش��ϴ� ���� : " + (char)ch3);
		
		//p.69 Q4
		int a = 10;
		double b = 2.0;
		
		System.out.println(a+b);
		
		//p.69 Q5
		
//		char uni = '��';
//	
//		System.out.println(uni);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���");
		int alpa = sc.nextInt();
		char calpa = (char)alpa;
			
		System.out.println(calpa);
		
	}
}

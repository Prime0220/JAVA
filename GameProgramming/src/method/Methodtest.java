//20210331_�������α׷���_����

package method;

import java.util.Scanner;

public class Methodtest 
{
	public static void main(String[] args) 
	{
		
		int a = 0, b = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է����ּ��� : ");
		a = sc.nextInt();
		System.out.print("ù��° ������ �Է����ּ��� : ");
		b = sc.nextInt();
		
		System.out.println("�� ���� ���� ��� : " + twoNumberSum(a, b));
		
		
	}
	
	private static int twoNumberSum(int a, int b) 
	{
		
		return a + b;
	}  
	
}

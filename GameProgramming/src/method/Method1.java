//2021_03_29 ���� ���α׷��� 

package method;

//import java.util.Scanner;


public class Method1 {
	public static void main(String[] args) {
		//method �޼ҵ�
				//1. ó���Ǵ� ������ ����.
				//������ġ, �ݺ�ó��, ����ó��, ���� ��..
//				System.out.println(/*����*/"Hello World");
//				System.out.print("���ڸ� �Է����ּ��� : ");
//				Scanner sc = new Scanner(System.in);
//				int num = sc.nextInt();
//				System.out.println(num);
				//2. ���α׷� ������ �����ϴ� ��ɾ�.
			
				
		attack();
		attack();
		// 1 �·�� , 2 �Ƶ��� , 3 ���춱 �� ��
		int userCommand = 2; 
		
		if (userCommand == 1) 
		{
			attack();
		}
		else if (userCommand == 2) 
		{
			attack1();
		}
	}
	
	static void attack() {
		System.out.println("�·���� ����߽��ϴ�.");
		
	}
	static void attack1() {
		System.out.println("2~");
		
	}
	
}

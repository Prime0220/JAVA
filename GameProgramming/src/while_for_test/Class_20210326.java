package while_for_test;

public class Class_20210326 {
	public static void main(String[] args) {

		//for문
		
		for (int i = 1; i <= 9; i++) 
		{
			for (int j = 2; j <= 9; j++) 
			{
				System.out.print(j + " * " + i + " = " + j*i+"	");

			}

			System.out.println();

		}
		
		//while문
		
		int WhileOnly_i = 10;
		
		while (WhileOnly_i >= 0) 
		{
			System.out.println(WhileOnly_i--);
		}		
		
		
		//위에꺼를 for문으로 만든것
		for (int a = 10; a >= 0; a--) 
		{
			System.out.println(a);
		}
		
		String str = "12345";
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			sum += (str.charAt(i) - '0');
		}
		System.out.println("sum = " + sum);
		
	}
}
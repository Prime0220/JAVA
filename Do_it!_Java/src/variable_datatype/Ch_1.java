package variable_datatype;

public class Ch_1 
{
	
	public static void main(String[] args) 
	{

		int num = 10;
		int bNum = 0B1010; // 10
		int oNum = 012;
		int hNum = 0XA;

		System.out.println
		(num+ "," +  bNum + "," + oNum + "," + hNum);


		

		//5
		int num1 = 0B000000000000000000000000000000101;
		//-5
		int num2 = 0B11111111111111111111111111111011;

		int sum = num1 + num2;

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);

	}
}

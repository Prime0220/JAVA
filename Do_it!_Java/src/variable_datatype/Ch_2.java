package variable_datatype;

public class Ch_2 
{
	public static void main(String[] args) 
	{
		int num;
		//Lvalue(왼쪽값) = rValue(오른쪽값);
		num = 10;
		
		System.out.println(num);
		
		//선언과 동시에 초기화
		
		int level = 20;
		System.out.println(level);
		
		//변수명 의미있게 선언
		
		int ns; 			//안좋은 예
		int numberOFStudent;//좋은 예
		
		//ByteVariable
		
		byte bData = -128;
		System.out.println(bData);
		
		byte bData2 = 127;
		System.out.println(bData2);
		
		//long
		
		long num1 = 12345678900L; // L == 식별자
		System.out.println();
		
		//char - 문자 자료형 
		
		char ch = 'A';
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		ch = 66;// B
		
		System.out.println(ch);
		
		int ch2 = 67;
		
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		//float, double - 실수 자료형
		
		double dNum = 3.14;	// 8byte
		float fNum = 3.14F; // 4byte, F == 식별자
	}
}

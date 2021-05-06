package various_operator;

public class Ch_2 
{

	public static void main(String[] args) 
	{

		// 복합 대입 연산자 Compound assignment operator

		int num = 10;

		System.out.println(num += 1);

		System.out.println(num %= 10);
		num -= 1;	// num = num - 1
		System.out.println(num);
		
		//조건 연산자  Conditional operator
		
		int a = (5 > 3)? 10:20;
		System.out.println(a);
		
		int fatherAge = 45, motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(fatherAge + " > " + motherAge + " : " +ch);
		
		//비트 연산자 Bit opertator 
		//c언어 에선 자주 씀 자바에선 잘 안씀 , 정수에만 사용할 수 있음
		
		int b = 5, c = 10;
		int result = b & c;
		
		System.out.println(result);
		
		int d = 5;
		System.out.println(d << 1); // = x2랑 같다.
		System.out.println(d); // d의 값은 바뀌지 않는다. 
		System.out.println(d <<= 1); //바뀌게 하려면 <<=을 써주자.
		System.out.println(d);
		
		d = 5;
		
		System.out.println(d << 2);
		System.out.println(d << 3);
		
		System.out.println(d >> 1); //00000010
		
	}
}

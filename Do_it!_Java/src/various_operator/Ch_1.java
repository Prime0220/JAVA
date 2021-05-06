package various_operator;

public class Ch_1 
{
	public static void main(String[] args) 
	{
		
		//대입 연산자 Assignment operator
		// datatype Leftvalue = Rightvalue 
		int age = 24;
		int mathScore = 80, engScore = 70;
		
		//대입 연산자는 우선 순위가 낮음
		int totalScore = mathScore + engScore;
		
		System.out.println(age);
		System.out.println(totalScore);
		
		int num = 10;
		int num2 = -num;
		
		System.out.println(num + ", " + num2);
		
		//num값을 바꾸고 싶을때
		num = -num;
		System.out.println(num);
		
		//산술연산자 Arithmetic operator
		int a = 10, b = 2;
		
		// + 두 항을 더함
		System.out.println(a + " + " + b +" = " + a+b);
		// - 앞에 있는 항에서 뒤에 있는 항을 뺌
		System.out.println(a + " - " + b +" = " + (a-b));
		// * 두 항을 곱함
		System.out.println(a + " * " + b +" = " + a*b);
		// / 두 항을 나누어 몫을 구함
		System.out.println(a + " ÷ " + b +" = " + a/b);
		// % 두 항을 나누어 나머지를 구함
		System.out.println(a + " ÷ " + b +" 의 나머지  " + a%b);
		
		
		//증가  연산자 Increment operator
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
		
		//감소 연산자 Reduction operator
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
		// ++, --의 위치에 따라 증가, 감소하는 순서가 달라진다.
		
		//관계 연산자 Relational operator
		
		int e = 4;
		// > 왼쪽항이 크면 참, 아니면 거짓
		System.out.println(e + " > 3	: " + (e>3));
		// < 왼쪽항이 작으면 참, 아니면 거짓
		System.out.println(e + " < 3	: " + (e<3));
		// >= 왼쪽항이 크거나 같으면 참, 아니면 거짓
		System.out.println(e + " >= 3	: " + (e>=3));
		// <= 왼쪽항이 작거나 같으면 참, 아니면 거짓
		System.out.println(e + " <= 3	: " + (e<=3));
		// == 왼쪽항이 오른쪽 항과 같으면 참, 아니면 거짓
		System.out.println(e + " == 3	: " + (e==3));
		// != 왼쪽항이 오른쪽 항이랑 다르면 참, 아니면 거짓 
		System.out.println(e + " != 3	: " + (e!=3));
		
		//논리 연산자 Logical operator ,
		//단락 회로 평가 Short Circuit Evaluation
		
		int f = 10;
		int i = 2;
		
		// 두 항의 값이 모두 참이어야 함
		boolean value = ((f = f + 10)< 10) && ((i = i + 2) < 10);
		System.out.println(f + " < 10 && "+ i + " < 10	: " + value);

		// 두 항의 값이 하나라도 참이면 참
		value = ((f = f + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(f + " > 10 || "+ i + " < 10	: " +value);
		
		
		
		
		
	}
}

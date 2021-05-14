package exercise;

import java.util.Scanner;

public class variable_datatype_test 
{
	public static void main(String[] args) 
	{
		
		
		//p. 37 Q6
		System.out.println("이화준");
		
		//p.45 1minute review 
		int age;
		age = 18;
		System.out.println(age);
		
		//p.53 1minute review
		char ch1 = 'Z', ch2 = 38;
		
		int ch3 = 97;
		
		System.out.println(ch1 + "\n" + ch1 + "에 해당하는 정수 값 : " + (int)ch1);
		System.out.println("38에 해당하는 문자 : " + ch2);
		System.out.println(ch3 + "\n" + ch3 + "에 해당하는 문자 : " + (char)ch3);
		
		//p.69 Q4
		int a = 10;
		double b = 2.0;
		
		System.out.println(a+b);
		
		//p.69 Q5
		
//		char uni = '글';
//	
//		System.out.println(uni);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		int alpa = sc.nextInt();
		char calpa = (char)alpa;
			
		System.out.println(calpa);
		
	}
}

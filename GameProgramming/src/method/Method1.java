//2021_03_29 게임 프로그래밍 

package method;

//import java.util.Scanner;


public class Method1 {
	public static void main(String[] args) {
		//method 메소드
				//1. 처리되는 구분을 짓다.
				//시작위치, 반복처리, 조건처리, 저장 등..
//				System.out.println(/*인자*/"Hello World");
//				System.out.print("숫자를 입력해주세요 : ");
//				Scanner sc = new Scanner(System.in);
//				int num = sc.nextInt();
//				System.out.println(num);
				//2. 프로그램 내에서 동작하는 명령어.
			
				
		attack();
		attack();
		// 1 승룡권 , 2 아도겐 , 3 찹살떡 두 개
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
		System.out.println("승룡권을 사용했습니다.");
		
	}
	static void attack1() {
		System.out.println("2~");
		
	}
	
}

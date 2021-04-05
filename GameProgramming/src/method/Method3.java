//20210331_게임프로그래밍

package method;

public class Method3 
{
	public static void main(String[] args) 
	{
		int result = 0;
		
//		result = twoNumberSum();
		
//		result += 3400;
		
		System.out.println("함수가 나온 뒤 결과 : " + twoNumberSum());
		
	}

	private static int twoNumberSum() {
		
		int firstNum = 100, secondNum = 200;
		
		//1.변수를 생성해서 결과를 저장하고 생성된 변수를 리턴해주는방법
		
		//2. 리턴 명령문 뒤에다가 결과를 처리해서 바로 보내는거
		
		return firstNum + secondNum; // 2번 방법
	}

	
	
	
	
}

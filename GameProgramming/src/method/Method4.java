//20210331_�������α׷���

package method;

public class Method4 {
	public static void main(String[] args) {
		int result = 0; 
		
		result = twoNumberSum(300, 500);
		System.out.println("�޼ҵ� ��� : " + result);
		
		result = twoNumberSum(1200, 500);
		System.out.println("�޼ҵ� ��� : " + result);
		
		result = twoNumberSum(-500, 500);
		System.out.println("�޼ҵ� ��� : " + result);
		
	}

	private static int twoNumberSum(int i, int j) {
		// TODO Auto-generated method stub
		
		return i + j;
	}
	
	
}

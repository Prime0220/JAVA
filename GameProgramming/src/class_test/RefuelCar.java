package class_test;

import javax.xml.stream.events.EndDocument;

public class RefuelCar {

	int oilBox = 100;

	public int getOil() {

		if (oilBox > 10) // ������ ������ �ִ��� Ȯ��
		{
			oilBox -= 10; // 10L�� ������
		}else 
		{
			return 0;
		}
		return 10;
	}
}

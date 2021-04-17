package class_test;

import javax.xml.stream.events.EndDocument;

public class RefuelCar {

	int oilBox = 100;

	public int getOil() {

		if (oilBox > 10) // 주유할 오일이 있는지 확인
		{
			oilBox -= 10; // 10L씩 주유함
		}else 
		{
			return 0;
		}
		return 10;
	}
}

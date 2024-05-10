package date.calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderExample {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
		System.out.println(sdf1.format(c.getTime()));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		

	}

}

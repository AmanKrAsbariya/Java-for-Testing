package date.calender;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date d  = new Date();
		System.out.println(d.toString());
		
		//customization
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sdf1.format(d));
	}

}

package pruebas1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pruebas {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar(2023, 02, 06
				, 23, 59, 59);
		int dayOfWeek = calendar.get(calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		System.out.println(calendar.getTime());
		String res = "";
        switch (dayOfWeek){
            case 1:
            res = "SUNDAY";
            break;
            case 2:
            res = "MONDAY";
            break;
            case 3:
            res = "TUESDAY";
            break;
            case 4:
            res = "WEDNESDAY";
            break;
            case 5:
            res = "THURSDAY";
            break;
            case 6:
            res = "FRIDAY";
            break;
            case 7:
            res = "SATURDAY";
            break;
            default:
            res = "";
        }
        System.out.println(res);
	}
}
